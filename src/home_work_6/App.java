package home_work_6;

import home_work_6.data.GetRawTextFromTXTFileToString;
import home_work_6.searchEngine.ISearchEngine;
import home_work_6.searchEngine.impl.EasySearch;

import java.io.*;
import java.util.*;

/*

        Далее задания выполнять только после прохождения темы "Работа с файлами"
    7. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки, из которой
        мы будет считывать текстовые файлы. Наполнить данную директорию книгами, 100 книг мнинимум. При запуске пользователю в
        консоль выдать список txt файлов и предложить выбрать файл, с которым мы будем работать. Пользователь, выбрав файл
        вводит то, что он хочет найти в этом файле. После каждого ввода осуществляется поиск. Вводит пока не надоест.
        Пользователь может вернуться к выбору файла. Результат всех его поисков должен накапливаться в файла result.txt в формате
        «Имя файла – слово – количество». Тестируем.

 */

public class App {
    private static final String RESULT_PATH = "result.txt";


    public static void main(String[] args) {
        App app = new App();
        app.printToConsole("Введите адрес папки с текстовыми файлами: ");
        String folderPath = app.getStringInput();
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            app.printToConsole("Некорректный путь к папке.");
            return;
        }

        while (true) {
            File selectedFile = app.selectFile(folder);

            if (selectedFile == null) {
                app.printToConsole("Файл не выбран. Программа завершена.");
                break;
            }

            try {
                app.processFile(selectedFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Выбор файлов в формате .txt из директории
     *
     * @param folder
     * @return
     */
    private File selectFile(File folder) {
        printToConsole("Список доступных файлов:");

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            printToConsole("В папке нет текстовых файлов.");
            return null;
        }

        for (int i = 0; i < files.length; i++) {
            System.out.println((i + 1) + ". " + files[i].getName());
        }
        printToConsole("Выберите номер файла (или 0 для выхода): ");
        int choice = getIntInput();

        if (choice == 0) {
            return null;
        } else if (choice >= 1 && choice <= files.length) {
            return files[choice - 1];
        } else {
            printToConsole("Некорректный выбор. Попробуйте снова.");
            return selectFile(folder);
        }
    }

    /**
     * Обработка файлов (поиск слова вывод в консоль и запись в файл)
     *
     * @param selectedFile
     * @throws IOException
     */
    private void processFile(File selectedFile) throws IOException {
        String wordForSearch;
        ISearchEngine searchEngine = new EasySearch();

        while (true) {
            printToConsole("Введите слово для поиска (или введите \":q\" для выбора другого файла): ");
            wordForSearch = getStringInput();

            if (":q".equals(wordForSearch)) {
                break;
            }

            long count = searchEngine.search(new GetRawTextFromTXTFileToString(selectedFile.getAbsolutePath()).get(), wordForSearch);
            printToConsole(selectedFile.getName() + " - " + wordForSearch + " - " + count);
            writeResultToFile(selectedFile.getName(), wordForSearch, count);
        }
    }

    /**
     * Получает int
     *
     * @return
     */
    private int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            printToConsole("Введите корректное число.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Получает строку
     *
     * @return
     */
    private String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Записывает все поисковые запросы введенные пользователем
     *
     * @param fileName   - имя файла
     * @param searchWord - слово которое для поиска
     * @param count      - количество найденых в тексте слов
     * @throws IOException
     */
    private void writeResultToFile(String fileName, String searchWord, long count) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_PATH, true));
        StringBuilder builder = new StringBuilder();

        builder.append(fileName);
        builder.append('-');
        builder.append(searchWord);
        builder.append('-');
        builder.append(count);
        builder.append('\n');

        writer.write(builder.toString());
        writer.flush();

    }

    /**
     * Выводит в консоль переданную строку
     *
     * @param message - сообщеие
     */
    private void printToConsole(String message) {
        System.out.println(message);
    }


}
