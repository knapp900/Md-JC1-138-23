package home_work_6;

import home_work_6.data.GetRawTextFromTXTFileToString;
import home_work_6.searchEngine.ISearchEngine;
import home_work_6.searchEngine.impl.EasySearch;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 Далее задания выполнять только после прохождения темы "Многопоточное программирование"
8. Написать новый класс с точкой входа. При запуске программы пользователь должен передать адрес папки, из которой
мы будет считывать текстовые файлы. После запуска пользователь указывает что он хочет найти в этих текстах. После каждого
ввода осуществляется поиск. Вводит пока не надоест. Поиск выполняется многопоточно. Один файл – одно задание для поиска.
Задания помещаются в ExecutorService. Результат всех его поисков должен накапливаться в файла result.txt в формате
«Имя файла – слово – количество».
После заверщение обработки всех книг вывести записанные результаты в файла result.txt;
Тестируем
  */
public class MultiThreadedSearchApp {
    private static final String RESULT_PATH = "result.txt";

    public static void main(String[] args) {
        MultiThreadedSearchApp mApp = new MultiThreadedSearchApp();
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ISearchEngine searchEngine = new EasySearch();
        String folderPath;
        File folder;
        String searchWord;

        mApp.printToConsole("Введите адрес папки с текстовыми файлами: ");

        folderPath = mApp.getStringInput();

        folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            mApp.printToConsole("Некорректный путь к папке.");
            return;
        }


        while (true) {

            mApp.printToConsole("Введите слово для поиска (или введите \":q\" для выбора другого файла): ");
            searchWord = mApp.getStringInput();

            if (":q".equalsIgnoreCase(searchWord)) {
                System.exit(0);
            }

            mApp.executeMultiThreadedSearch(executorService, searchEngine, folderPath, searchWord);
        }


    }

    /**
     * Проводит поиск слова в указанной директории в .txt файлах и печатает результат в файл.
     *
     * @param executorService
     * @param searchEngine
     * @param folderPath
     * @param searchWord
     */
    private void executeMultiThreadedSearch(ExecutorService executorService, ISearchEngine searchEngine, String folderPath, String searchWord) {

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folderPath), "*.txt")) {

            for (Path path : stream) {

                executorService.execute(() -> {
                    String content = new GetRawTextFromTXTFileToString(path.toString()).get();
                    long count = searchEngine.search(content, searchWord);
                    writeResultToFile(path.getFileName().toString(), searchWord, count, Thread.currentThread().getName());
                });
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Записывает все поисковые запросы введенные пользователем
     *
     * @param fileName   - имя файла
     * @param searchWord - слово которое для поиска
     * @param count      - количество найденых в тексте слов
     * @throws IOException
     */
    private void writeResultToFile(String fileName, String searchWord, long count, String threadName) {

        StringBuilder builder = new StringBuilder();

        builder.append(fileName);
        builder.append('-');
        builder.append(searchWord);
        builder.append('-');
        builder.append(count);
        builder.append('-');
        builder.append(threadName);
        builder.append('\n');

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RESULT_PATH, true))) {
            writer.write(builder.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


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
     * Выводит в консоль переданную строку
     *
     * @param message - сообщеие
     */
    private void printToConsole(String message) {
        System.out.println(message);
    }


}





