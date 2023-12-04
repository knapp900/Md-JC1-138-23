package home_work_6.searchEngine.impl;

import home_work_6.searchEngine.ISearchEngine;

import java.util.Locale;

/*
    4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
        В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
        Данный класс ищет слова с учётом регистра.
 */
public class EasySearch implements ISearchEngine {
    private static final char[] EXCLUDED_CHARACTERS =
            {'!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_', '`', '{', '|', '}', '~', ' ', (char) 10};
    private boolean isIgnoreCase;

    public EasySearch() {
        this.isIgnoreCase = false;
    }

    public EasySearch(boolean isIgnoreCase) {
        this.isIgnoreCase = isIgnoreCase;
    }


    //    @Override
//    public long search(String text, String word) {
//        String temp;
//        String wordInsensitiveCase = null;
//        long count = 0;
//        int index = 0;
//
//        if (isIgnoreCase) {
//            temp = prepareText(text).toLowerCase(Locale.ROOT);
//            wordInsensitiveCase = word.toLowerCase(Locale.ROOT);
//
//        } else {
//            temp = prepareText(text);
//            wordInsensitiveCase = word;
//        }
//
//        while ((index = temp.indexOf(wordInsensitiveCase, index)) != -1) {
//
//            if (index != 0) {
//
//                if (temp.charAt(index + wordInsensitiveCase.length()) == ' ' && temp.charAt(index - 1) == ' ') {
//
//                    count++;
//                }
//                index += wordInsensitiveCase.length();
//
//
//            } else {
//
//                count++;
//                index += wordInsensitiveCase.length();
//            }
//
//        }
//
//        return count;
//
//    }
    @Override
    public long search(String text, String word) {
        String temp;
        String wordInsensitiveCase;
        long count = 0;
        int index = 0;

        if (isIgnoreCase) {
            temp = prepareText(text).toLowerCase(Locale.ROOT);
            wordInsensitiveCase = word.toLowerCase(Locale.ROOT);
        } else {
            temp = prepareText(text);
            wordInsensitiveCase = word;
        }

        while ((index = temp.indexOf(wordInsensitiveCase, index)) != -1) {
            boolean isWordStart = index == 0 || temp.charAt(index - 1) == ' ';
            boolean isWordEnd = (index + wordInsensitiveCase.length() == temp.length()) ||
                    (index + wordInsensitiveCase.length() < temp.length() && temp.charAt(index + wordInsensitiveCase.length()) == ' ');

            if (isWordStart && isWordEnd) {
                count++;
            }
            index += wordInsensitiveCase.length();
        }

        return count;
    }

    /**
     * Подготавливает строку удаляя всё кроме слов и разделяет их пробелами
     *
     * @param text - текст для обработки
     * @return - обработанный текст
     */
    private String prepareText(String text) {

        char[] str = text.toCharArray();

        for (int i = 0; i < str.length; i++) {

            char temp = str[i];

            if (checkChar(temp)) {
                str[i] = ' ';
            } else if (str[i] == '-' && (!checkChar(str[i - 1]) && !checkChar(str[i + 1]))) {
                continue;
            }

        }

        return charArrayToString(str);
    }

    /**
     * Является ли char исключаемым
     *
     * @param charForCheck - символ для проверки
     * @return - true если символ является исключаемым
     */
    private boolean checkChar(char charForCheck) {

        for (char excludedCharacter : EXCLUDED_CHARACTERS) {
            if (charForCheck == excludedCharacter) {
                return true;
            }
        }
        return false;
    }

    /**
     * Преобразует char[] в строку
     *
     * @param chars
     * @return
     */
    private String charArrayToString(char[] chars) {
        StringBuilder builder = new StringBuilder();

        for (char aChar : chars) {
            builder.append(aChar);
        }

        return builder.toString();
    }


}
