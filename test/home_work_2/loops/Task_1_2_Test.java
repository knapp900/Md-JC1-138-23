package home_work_2.loops;

import home_work_2.loops.Task_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1_2_Test {

    private Task_1_2 task = new Task_1_2();

    @Test
    public void stringToIntArray() {
        int[] arr = {1, 2, 3};
        assertArrayEquals(task.stringToIntArray("123"), arr);
    }

    @Test
    public void multiplyingDigitsOfNumber() {
        int[] arr = {1, 2, 3};
        assertEquals(task.multiplyingDigitsOfNumber(arr), 6);
    }

    @Test
    public void multiplyingDigitsOfNumberWhitZeros() {
        int[] arr = {0, 0, 0};
        assertEquals(task.multiplyingDigitsOfNumber(arr), 0);
    }

    @Test
    public void multiplyingDigitsOfNumberWhitNegativeAndOnePositiveNumbers() {
        int[] arr = {1, -2, -3};
        assertEquals(task.multiplyingDigitsOfNumber(arr), 6);
    }

    @Test
    public void multiplyingDigitsOfNumberWhitNegativeNumbers() {
        int[] arr = {-1, -2, -3};
        assertEquals(task.multiplyingDigitsOfNumber(arr), -6);
    }

    @Test
    public void isNumberWhitNumericArgumentsTest() {

        assertTrue(task.isNumber("1234"));
    }

    @Test
    public void isNumberWhitNegativeNumericArgumentsTest() {

        assertTrue(task.isNumber("-1234"));
    }

    @Test
    public void isNumberWhitNullArgumentsTest() {

        assertFalse(task.isNumber("null"));
    }

    @Test
    public void isFlout() {

        assertTrue(task.isFlout("0.2"));
    }

    @Test
    public void isFloutWhitNonFloutArgument() {

        assertFalse(task.isFlout("o.2"));
    }

    @Test
    public void buildAnswer() {

        int[] arr = {1, 2, 3};
        assertEquals(task.buildAnswer(arr,6),"1*2*3=6");
    }
}
