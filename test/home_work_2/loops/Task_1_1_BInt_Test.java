package home_work_2.loops;

import home_work_2.loops.Task_1_1_BInt;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1_1_BInt_Test {

    private Task_1_1_BInt task = new Task_1_1_BInt();

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

        assertEquals(task.factorial(3), new BigInteger("6"));

    }

    @Test
    public void factorialWithZeroNumber() {

        assertEquals(task.factorial(0), new BigInteger("1"));
    }

    @Test
    public void factorialWithNegativeNumber() {

        assertEquals(task.factorial(-10),  new BigInteger("1"));
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
        assertEquals(task.buildAnswer(new BigInteger("6"), 3), "1*2*3=6");
    }
}
