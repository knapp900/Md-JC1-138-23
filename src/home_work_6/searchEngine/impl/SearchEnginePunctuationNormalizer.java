package home_work_6.searchEngine.impl;

import home_work_6.searchEngine.ISearchEngine;
/*
    4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять нежелательные символы.
	    Любые знаки препинания, лишние пробелы и например переводы строк.
 */

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.searchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        // не смог подобрать выражение для слов написанных через дефис."4-х" для программы это 2 слова.
        text = text.replaceAll("[\\p{Punct}]+", " ").replaceAll("\\s+", " ").trim();

        return searchEngine.search(text, word);
    }
}
