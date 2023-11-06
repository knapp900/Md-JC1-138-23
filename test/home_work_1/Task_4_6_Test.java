package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_4_6_Test {

    @Test
    @DisplayName("Определить високосный год или нет:2024 = true")
    public void isLeapYearTest_1() {
        Assertions.assertTrue(Task_4_6.isLeapYear(2024));
    }

    @Test
    @DisplayName("Определить високосный год или нет:2023= false")
    public void isLeapYearTest_2() {
        Assertions.assertFalse(Task_4_6.isLeapYear(2023));
    }

    @Test
    @DisplayName("Определить високосный год или нет:-2024= false")
    public void isLeapYearTest_3() {
        Assertions.assertFalse(Task_4_6.isLeapYear(-2024));
    }

    @Test
    @DisplayName("Определить високосный год или нет:0 = false")
    public void isLeapYearTest_4() {
        Assertions.assertFalse(Task_4_6.isLeapYear(0));
    }

}
