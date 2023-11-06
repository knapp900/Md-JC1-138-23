package home_work_2.loops;

import home_work_2.loops.Task_1_3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1_3_Test {

    private Task_1_3 task = new Task_1_3();

    @Test
    public void isNumberWhitCharacterArgumentsTest() {

        assertFalse(task.isNumber("-ASCII"));
    }


    @Test
    public void isNumberWhitNumericArgumentsTest() {

        assertTrue(task.isNumber("12 34"));
    }

    @Test
    public void isNumberWhitNegativeNumericArgumentsTest() {

        assertTrue(task.isNumber("-12 -34"));
    }

    @Test
    public void isNumberWhitNullArgumentsTest() {

        assertFalse(task.isNumber("null"));
    }

    @Test
    public void customPow() {

        assertEquals(task.customPow(2.0, 10), 1024);
    }

    @Test
    public void customPowWithNegativeNumber() {

        assertEquals(task.customPow(-2.0, 10), 1024);
    }

    @Test
    public void customPowWithZeroNumber() {

        assertEquals(task.customPow(0, 10), 0);
    }

    @Test
    public void stringToIntArray() {
        int[] arr = {2,10};
        assertArrayEquals(task.stringToIntArray("2 10"), arr);
    }

    @Test
    public void powerNumberValidation() {
        assertTrue(task.powerNumberValidation(1));
    }

    @Test
    public void powerNumberValidationWhitZero() {
        assertFalse(task.powerNumberValidation(0));
    }

    @Test
    public void powerNumberValidationWhitNegative() {
        assertFalse(task.powerNumberValidation(-1));
    }

}
