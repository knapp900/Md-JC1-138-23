package home_work_6.searchEngine;

public interface ISearchEngine {
    /**
     * Метод возвращает информации о количестве раз которое встречается слово
     * в тексте. Первый параметр текст в котором ищем, второй параметр что ищем в тексте.
     *
     * @param text - первый параметр текст в котором ищем.
     * @param word - второй параметр что ищем в тексте.
     * @return - результат.
     */
    long search(String text, String word);
}
