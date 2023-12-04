package home_work_6;

import home_work_6.data.GetRawTextFromTXTFileToString;
import home_work_6.searchEngine.impl.EasySearch;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadedSearchApp {


    private static final String RESULT_FILE = "result.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите адрес папки с текстовыми файлами: ");
        String folderPath = scanner.nextLine();
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Некорректный путь к папке.");
            return;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {
            while (true) {
                File selectedFile = selectFile(folder);

                if (selectedFile == null) {
                    System.out.println("Файл не выбран. Программа завершена.");
                    break;
                }

                processFile(executorService, selectedFile);
            }
        } finally {
            executorService.shutdown();
        }
    }

    private static File selectFile(File folder) {
        // ... (same as in the previous version)
        return null;
    }

    private static void processFile(ExecutorService executorService, File selectedFile) {
        String wordForSearch;
        EasySearch searchEngine = new EasySearch();

        while (true) {
            System.out.println("Введите слово для поиска (или введите \":q\" для выбора другого файла): ");
            wordForSearch = getStringInput();

            if (":q".equals(wordForSearch)) {
                break;
            }

            String finalWordForSearch = wordForSearch;
            Future<Long> resultFuture = executorService.submit(() ->
                    searchEngine.search(new GetRawTextFromTXTFileToString(selectedFile.getAbsolutePath()).get(), finalWordForSearch));

            try {
                long count = resultFuture.get();
                System.out.println(selectedFile.getName() + " - " + wordForSearch + " - " + count);
                writeResultToFile(selectedFile.getName(), wordForSearch, count);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void writeResultToFile(String fileName, String searchWord, long count) {
        try (FileWriter writer = new FileWriter(RESULT_FILE, true)) {
            writer.write(fileName + " – " + searchWord + " – " + count + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите адрес папки с текстовыми файлами: ");
//        String folderPath = scanner.nextLine();
//        File folder = new File(folderPath);
//
//        if (!folder.exists() || !folder.isDirectory()) {
//            System.out.println("Некорректный путь к папке.");
//            return;
//        }
//
//        while (true) {
//            File selectedFile = selectFile(folder);
//
//            if (selectedFile == null) {
//                System.out.println("Файл не выбран. Программа завершена.");
//                break;
//            }
//
//            processFile(selectedFile);
//        }
//    }
//
//    private static File selectFile(File folder) {
//        System.out.println("Список доступных файлов:");
//        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
//
//        if (files == null || files.length == 0) {
//            System.out.println("В папке нет текстовых файлов.");
//            return null;
//        }
//
//        for (int i = 0; i < files.length; i++) {
//            System.out.println((i + 1) + ". " + files[i].getName());
//        }
//
//        System.out.println("Выберите номер файла (или 0 для выхода): ");
//        int choice = getIntInput();
//
//        if (choice == 0) {
//            return null; // Exit if the user chooses 0
//        } else if (choice >= 1 && choice <= files.length) {
//            return files[choice - 1];
//        } else {
//            System.out.println("Некорректный выбор. Попробуйте снова.");
//            return selectFile(folder);
//        }
//    }
//
//    private static void processFile(File selectedFile) {
//        String wordForSearch;
//        EasySearch searchEngine = new EasySearch();
//
//        while (true) {
//            System.out.println("Введите слово для поиска (или введите \":q\" для выбора другого файла): ");
//            wordForSearch = getStringInput();
//
//            if (":q".equals(wordForSearch)) {
//                break;
//            }
//
//            long count = searchEngine.search(new GetRawTextFromTXTFileToString(selectedFile.getAbsolutePath()).get(), wordForSearch);
//
//            System.out.println(selectedFile.getName() + " - " + wordForSearch + " - " + count);
//            writeResultToFile(selectedFile.getName(), wordForSearch, count);
//        }
//    }
//
//    private static int getIntInput() {
//        Scanner scanner = new Scanner(System.in);
//        while (!scanner.hasNextInt()) {
//            System.out.println("Введите корректное число.");
//            scanner.next(); // consume invalid input
//        }
//        return scanner.nextInt();
//    }
//
//    private static String getStringInput() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//
//    private static void writeResultToFile(String fileName, String searchWord, long count) {
//        // Implement writing to result.txt here
//        // You may use similar logic as in your previous code
//    }
}




