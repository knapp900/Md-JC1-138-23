package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_4_3_Test {

    @Test
    @DisplayName("4.3 Проверка делимости одного числа на другое 2/2 = true")
    public void divisionCheck_1() {

        Assertions.assertTrue(Task_4_3.divisionCheck(2, 2));

    }

    @Test
    @DisplayName("4.3 Проверка делимости одного числа на другое 3/2 = false")
    public void divisionCheck_2() {

        Assertions.assertFalse(Task_4_3.divisionCheck(3, 2));

    }

    @Test
    @DisplayName("4.3 Проверка делимости одного числа на другое 2/0 = ArithmeticException")
    public void divisionCheck_3() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class,() -> {Task_4_3.divisionCheck(2, 0);});
        Assertions.assertTrue(exception.getMessage().contains("/ by zero"));
    }

    @Test
    @DisplayName("4.3 Проверка делимости одного числа на другое -2/-2 = true")
    public void divisionCheck_4() {

        Assertions.assertTrue(Task_4_3.divisionCheck(-2, -2));

    }
}
