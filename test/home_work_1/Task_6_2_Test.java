package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_6_2_Test {

    @Test
    @DisplayName("Приветствие Васи = Привет! Я тебя так долго ждал")
    public void greetingsTest_1() {

        Assertions.assertEquals(Task_6_2.greetings("Вася"), "Привет!\nЯ тебя так долго ждал");

    }

    @Test
    @DisplayName("Приветствие Анастасии = Я тебя так долго ждал")
    public void greetingsTest_2() {

        Assertions.assertEquals(Task_6_2.greetings("Анастасия"), "Я тебя так долго ждал");

    }

    @Test
    @DisplayName("Приветствие другое имя = Добрый день, а вы кто?")
    public void greetingsTest_3() {

        Assertions.assertEquals(Task_6_2.greetings("другое имя"), "Добрый день, а вы кто?");

    }


}
