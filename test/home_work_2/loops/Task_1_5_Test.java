package home_work_2.loops;

import home_work_2.loops.Task_1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1_5_Test {

    @Test
    public void findMaxDigit() {

        Assertions.assertEquals(Task_1_5.findMaxDigit("123"), 3);
    }

    @Test
    public void probabilityOfEvenRandomNumbers() {

        double res = 0;

        for (int i = 1; i < 100; i++) {
            res = Task_1_5.probabilityOfEvenRandomNumbers(new Random(), i);
        }

        assertTrue((res > 45 || res < 55));
    }

    @Test
    public void countEvenAndUnevenDigitsOfNumber() {

        int[] arr = {1, 3};
        assertArrayEquals(Task_1_5.countEvenAndUnevenDigitsOfNumber("1231"), arr);
    }

    @Test
    public void fib() {

        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(Task_1_5.fib(9), arr);
    }

    @Test
    public void printRangeOfNumbersWithStep() {

        int[] arr = {10, 15, 20, 25, 30, 35};
        assertArrayEquals(Task_1_5.printRangeOfNumbersWithStep(10, 35, 5), arr);
    }
    @Test
    public void numberReversal() {

        assertEquals(Task_1_5.numberReversal("123"),"321");
    }
}
