package home_work_6.searchEngine.impl;

import home_work_6.searchEngine.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {

        long count = 0;

        Pattern pattern = Pattern.compile("\\b" + word + "\\b");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            count++;
        }

        return count;
    }

}
