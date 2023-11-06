package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_4_5_Test {

    @Test
    @DisplayName("4.5 Буква или иной символ E = true")
    public void letterOrSymbolTest_1(){
        Assertions.assertEquals(Task_4_5.letterOrSymbol('E'),"Вы ввели букву: E");
    }


    @Test
    @DisplayName("4.5 Буква или иной символ # = true")
    public void letterOrSymbolTest_2() {
        Assertions.assertEquals(Task_4_5.letterOrSymbol('#'), "Вы ввели символ: #");
    }

}
