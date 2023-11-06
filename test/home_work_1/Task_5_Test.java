package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_5_Test {

    @Test
    @DisplayName("Спать или идти на работу:рабочий день - нет,отпуск - нет = Можно спать дальше!")
    public void sleepInTest_1() {

        boolean weekday = false;
        boolean vocation = false;

        Assertions.assertTrue(Task_5.sleepIn(weekday, vocation));

    }

    @Test
    @DisplayName("Спать или идти на работу:рабочий день - да,отпуск - нет = Пора идти на работу")
    public void sleepInTest_2() {

        boolean weekday = true;
        boolean vocation = false;

        Assertions.assertFalse(Task_5.sleepIn(weekday, vocation));

    }

    @Test
    @DisplayName("Спать или идти на работу:рабочий день - да,отпуск - да = Можно спать дальше!")
    public void sleepInTest_3() {

        boolean weekday = true;
        boolean vocation = true;

        Assertions.assertTrue(Task_5.sleepIn(weekday, vocation));

    }

    @Test
    @DisplayName("Вывод сообщения: рабочий день - да ,отпуск - нет = Пора идти на работу!")
    public void printAnswerTest_1() {

        boolean weekday = true;
        boolean vocation = false;

        Assertions.assertEquals(Task_5.printAnswer(weekday, vocation), "Пора идти на работу!");

    }

    @Test
    @DisplayName("Вывод сообщения: рабочий день - да ,отпуск - да = Можно спать дальше!")
    public void printAnswerTest_2() {

        boolean weekday = true;
        boolean vocation = true;

        Assertions.assertEquals(Task_5.printAnswer(weekday, vocation), "Можно спать дальше!");

    }

}
