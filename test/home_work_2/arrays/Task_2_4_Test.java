package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_2_4_Test {

    @Test
    public void sumOfEvenConstituentElementsOfArray() {

        Assertions.assertEquals(Task_2_4.sumOfEvenConstituentElementsOfArray(new int[]{1, 2, 3, 10}), 12);
    }

    @Test
    public void sumOfEvenConstituentElementsOfArrayWhitNegativeNumbers() {

        Assertions.assertEquals(Task_2_4.sumOfEvenConstituentElementsOfArray(new int[]{-1, -2, -3, -10}), 0);
    }

    @Test
    public void maxElementOfArrayForEvenIndex() {

        Assertions.assertEquals(Task_2_4.maxElementOfArrayForEvenIndex(new int[]{1, 2, 13, 10, 12}), 13);
    }

    @Test
    public void maxElementOfArrayForEvenIndexWhitNegativeNumbers() {

        Assertions.assertEquals(Task_2_4.maxElementOfArrayForEvenIndex(new int[]{-1, -2, -13, -10, -12}), 0);
    }

    @Test
    public void elementsLessArithmeticMean() {

        int[] arr = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(Task_2_4.elementsLessArithmeticMean(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}), arr);
    }

    @Test
    public void twoMinElementsOfArray() {

        Assertions.assertArrayEquals(Task_2_4.twoMinElementsOfArray(new int[]{1, 2, 3, 4, 0, 6, 7, 8, 9, -10, 11}), new int[]{0, -10});
    }

    @Test
    public void compressArray() {
        int[] arr = {1, 6, 7, 8, 9, 10, 0, 0, 0, 0};
        Assertions.assertArrayEquals(Task_2_4.compressArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2, 5), arr);
    }

    @Test
    public void sumOfArrayDigit() {

        Assertions.assertEquals(Task_2_4.sumOfArrayDigit(new int[]{55, 5}),15);
    }
}
