package home_work_6.searchEngine.impl;

import home_work_6.searchEngine.ISearchEngine;
import org.junit.jupiter.api.*;

public class TestISearchEngine {

    ISearchEngine searchEngine_1 = new EasySearch();
    ISearchEngine searchEngine_2 = new RegExSearch();
    ISearchEngine searchEngine_3 = new SearchEngineCaseInsensitive(searchEngine_1);
    ISearchEngine searchEngine_4 = new SearchEnginePunctuationNormalizer(searchEngine_1);

    @Test
    @DisplayName("test: Мама мыла раму / мыл = 0")
    public void searchExample_1(){
        Assertions.assertEquals(searchEngine_1.search("Мама мыла раму","мыл"),0);
        Assertions.assertEquals(searchEngine_2.search("Мама мыла раму","мыл"),0);
        Assertions.assertEquals(searchEngine_3.search("Мама мыла раму","мыл"),0);
        Assertions.assertEquals(searchEngine_4.search("Мама мыла раму","мыл"),0);
    }

    @Test
    @DisplayName("test: Мама мыла раму / мыла = 1")
    public void searchExample_2(){
        Assertions.assertEquals(searchEngine_1.search("Мама мыла раму","мыла"),1);
        Assertions.assertEquals(searchEngine_2.search("Мама мыла раму","мыла"),1);
        Assertions.assertEquals(searchEngine_3.search("Мама мыла раму","мыла"),1);
        Assertions.assertEquals(searchEngine_4.search("Мама мыла раму","мыла"),1);
    }

    @Test
    @DisplayName("test: Слова через дефис")
    public void searchExample_3() {
        Assertions.assertEquals(searchEngine_1.search("4-х", "4-х"), 1);
        Assertions.assertEquals(searchEngine_2.search("4-х", "4-х"), 1);
        Assertions.assertEquals(searchEngine_3.search("4-х", "4-х"), 1);
        Assertions.assertEquals(searchEngine_4.search("4-х", "4-х"), 1);

    }

    @Test
    @DisplayName("test: Мама мыла раму мама / мама = 2")
    public void searchCaseInsensitive() {

        ISearchEngine searchEngineForCaseInsensitiveTest_1 = new EasySearch(true);
        ISearchEngine searchEngineForCaseInsensitiveTest_2 = new SearchEngineCaseInsensitive(searchEngine_1);
        ISearchEngine searchEngineForCaseInsensitiveTest_3 = new SearchEngineCaseInsensitive(searchEngine_2);


        Assertions.assertEquals(searchEngineForCaseInsensitiveTest_1.search("Мама мыла раму мама", "мама"), 2);
        Assertions.assertEquals(searchEngineForCaseInsensitiveTest_2.search("Мама мыла раму мама", "мама"), 2);
        Assertions.assertEquals(searchEngineForCaseInsensitiveTest_3.search("Мама мыла раму мама", "мама"), 2);
    }
}
