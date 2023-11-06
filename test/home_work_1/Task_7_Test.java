package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class Task_7_Test {


    @Test
    @DisplayName("Конвертирует массив из 10 цифр в строку формата : (XXX) XXX-XXXX")
    public void createPhoneNumberTest_1() {

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        Assertions.assertEquals(Task_7.createPhoneNumber(arrayOfNumbers), "(123) 456-7890");

    }

    @Test
    @DisplayName("Конвертирует массив из 11 цифр в строку формата : null")
    public void createPhoneNumberTest_2() {

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11};

        Assertions.assertNull(Task_7.createPhoneNumber(arrayOfNumbers));

    }

}
