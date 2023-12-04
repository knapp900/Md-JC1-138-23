package home_work_6.searchEngine;

import java.util.*;
import java.util.stream.Collectors;

public class GetHighFrequencyWords {

    private Map<String, Integer> resultMap;
    private List<Map.Entry<String, Integer>> listForFrequencyProcessing;
    private String[] source;

    public GetHighFrequencyWords(String[] source) {
        this.source = source;
        fillMapOfWords(false);
        fillListTopNHighFrequencyWords();
    }

    public GetHighFrequencyWords(String[] source, boolean isIgnoreCase) {
        this.source = source;
        fillMapOfWords(isIgnoreCase);
        fillListTopNHighFrequencyWords();
    }

    /**
     * Получаем топ N слов по частоте
     *
     * @param quantity - количество топ N слов
     * @return - List<String>
     */
    public List<String> getTopNHighFrequencyWords(int quantity) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            result.add(listForFrequencyProcessing.get(i).toString() + " раз");
        }

        return result;
    }

    /**
     * Получаем частоту вхождений переданного слова
     *
     * @param word - слово для поиска
     * @return - результат в формате "война=52 раз"
     */
    public String getFrequencyWordByWord(String word) {

        String tmpWord = word.toLowerCase(Locale.ROOT);

        for (Map.Entry<String, Integer> map : listForFrequencyProcessing) {

            if (Objects.equals(map.getKey(), tmpWord)) {
                return map.toString() + " раз";
            }
        }

        return null;
    }

    /**
     * Заполняет HashMap из массива строк
     *
     * @param isIgnoreCase - если true игнорирует регистр
     */
    private void fillMapOfWords(boolean isIgnoreCase) {
        resultMap = new HashMap<>();
        String tmp;

        for (int i = 0; i < this.source.length; i++) {

            if (isIgnoreCase) {
                tmp = this.source[i].toLowerCase(Locale.ROOT);

            } else {
                tmp = this.source[i];
            }

            if (resultMap.containsKey(tmp)) {
                resultMap.put(tmp, resultMap.get(tmp) + 1);

            } else {
                resultMap.put(tmp, 1);
            }
        }

    }

    /**
     * Заполняет список отсортированными по value результатами из HashMap
     */
    private void fillListTopNHighFrequencyWords() {

        listForFrequencyProcessing = new ArrayList<>(resultMap.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList()));

    }


}

