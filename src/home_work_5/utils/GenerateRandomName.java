package home_work_5.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomName {

    private static final char[] CHARACTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] RUSSIAN_CHARACTERS = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private static final String[] REAL_NAMES = {"Ярик", "Игнат", "Анатолий", "Гена"};
    private static final int MAX_LENGTH_NAME = 20;
    private static Random random = new Random();
    private static StringBuilder builder;

    private static List<String> listNamesFromFile;

    public static String generateRandomName() {

        builder = new StringBuilder();

        int quantityOfIteration = random.nextInt(MAX_LENGTH_NAME);

        for (int i = 0; i < quantityOfIteration; i++) {

            builder.append(CHARACTERS[random.nextInt(CHARACTERS.length)]);
        }

        return builder.toString();

    }

    public static String generateRussianName() {

        builder = new StringBuilder();

        int quantityOfIteration = random.nextInt(MAX_LENGTH_NAME);

        for (int i = 0; i < quantityOfIteration; i++) {

            builder.append(RUSSIAN_CHARACTERS[random.nextInt(RUSSIAN_CHARACTERS.length)]);
        }

        return builder.toString();

    }

    public static String generateRealName() {

        return REAL_NAMES[random.nextInt(REAL_NAMES.length)];
    }

    public static String generateNameFromFile(String fileName) throws IOException {

        listNamesFromFile = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                listNamesFromFile.add(line);
            }

        } catch (IOException e) {

            throw new IOException();
        }

        return listNamesFromFile.get(random.nextInt(listNamesFromFile.size()));

    }
}
