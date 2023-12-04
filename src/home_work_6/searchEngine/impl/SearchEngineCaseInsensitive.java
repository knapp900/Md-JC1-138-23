package home_work_6.searchEngine.impl;

import home_work_6.searchEngine.ISearchEngine;

import java.util.Locale;

public class SearchEngineCaseInsensitive implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine iSearchEngine) {

        this.searchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {

//        if (searchEngine instanceof RegExSearch) {
//            // пробовал Pattern.CASE_INSENSITIVE не вышло( думаю по причине ASCII
//            return searchEngine.search(text.toLowerCase(Locale.ROOT), word.toLowerCase(Locale.ROOT));
//
//        } else {
//
//            return searchEngine.search(text.toLowerCase(Locale.ROOT), word.toLowerCase(Locale.ROOT));
//        }
        return searchEngine.search(text.toLowerCase(Locale.ROOT), word.toLowerCase(Locale.ROOT));
    }
}
