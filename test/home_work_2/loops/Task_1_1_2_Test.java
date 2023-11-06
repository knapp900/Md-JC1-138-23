package home_work_2.loops;

import home_work_2.loops.Task_1_1_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_1_1_2_Test {
    private Task_1_1_2 task = new Task_1_1_2();

    @Test
    public void getFirstArgumentTest() {
        String[] arr = {"hello", "world", "!"};

        assertEquals(task.getFirstArgument(arr), "hello");
    }

    @Test
    public void getFirstArgumentWithEmptyArgumentsTest() {
        String[] arr = {};

        assertEquals(task.getFirstArgument(arr), null);
    }

    @Test
    public void stringToInt() {

        assertEquals(task.stringToInt("111"), 111);
    }

    @Test
    public void factorial() {

        assertEquals(task.factorial(3), 6);

    }

    @Test
    public void factorialWithZeroNumber() {

        assertEquals(task.factorial(0), 1);
    }

    @Test
    public void factorialWithNegativeNumber() {

        assertEquals(task.factorial(-10), 1);
    }

    @Test
    public void isNotOverflow_1() {

        assertFalse(task.isNotOverflow(Long.MAX_VALUE + 1));
    }

    @Test
    public void isNotOverflow_2() {

        assertTrue(task.isNotOverflow(Long.MAX_VALUE - 1));
    }

    @Test
    public void isNumberWhitCharacterArgumentsTest() {

        assertFalse(task.isNumber("-ASCII"));
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
    public void buildAnswer() {
        assertEquals(task.buildAnswer(6, 3), "1*2*3=6");
    }
}
