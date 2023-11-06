package home_work_2.utils;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilsTest {

    @Test
    public void arrayRandomCheckLengthTest() {

        assertEquals(ArraysUtils.arrayRandom(10, 20).length, 10);
    }

    @Test
    public void arrayRandomCheckZeroLengthTest() {

        assertEquals(ArraysUtils.arrayRandom(0, 20).length, 0);
    }


    @Test
    public void arrayRandomCheckBoundRandomTest() {

        int[] resultArray = ArraysUtils.arrayRandom(100, 10);

        for (int j : resultArray) {

            assertTrue(j >= 0 && j <= 10);
        }
    }

    @Test
    public void arrayRandomCheckNegativeLengthTest() {

        assertThrows(NegativeArraySizeException.class, () -> ArraysUtils.arrayRandom(-12, 10));
    }

    @Test
    public void isNumberWhitCharacterArgumentsTest() {

        assertFalse(Utils.isNumber("-ASCII"));
    }

    @Test
    public void isNumberWhitNumericArgumentsTest() {

        assertTrue(Utils.isNumber("1234"));
    }

    @Test
    public void isNumberWhitNegativeNumericArgumentsTest() {

        assertTrue(Utils.isNumber("-1234"));
    }

    @Test
    public void isNumberWhitNullArgumentsTest() {

        assertFalse(Utils.isNumber("null"));
    }

    @Test
    public void isNumberWithSpacesWhitCharacterArgumentsTest() {

        assertFalse(Utils.isNumberWithSpaces("-AS CII"));
    }

    @Test
    public void isNumberWithSpacesWhitNumericArgumentsTest() {

        assertTrue(Utils.isNumberWithSpaces(" 123 4 "));
    }

    @Test
    public void isNumberWithSpacesWhitNegativeNumericArgumentsTest() {

        assertTrue(Utils.isNumberWithSpaces(" -12 34 "));
    }

    @Test
    public void isNumberWithSpacesWhitNullArgumentsTest() {

        assertFalse(Utils.isNumberWithSpaces("null"));
    }

    @Test
    public void stringToIntTest() {

        assertEquals(Utils.stringToInt("-11"), -11);
    }

}
