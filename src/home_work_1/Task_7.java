package home_work_1;
/*
7.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр и будет
    возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
    Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0}
    возвращаемый результат: (123) 456-7890.
    (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java).
    В задании нельзя использовать колекции, стрима.
 */

public class Task_7 {

    private static final int VALID_LENGTH = 10;

    public static void main(String[] args) {

        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String answer = createPhoneNumber(arrayOfNumbers);

        System.out.println(answer != null ? answer : "Неверная длинна массива");

    }

    private static boolean isValid(int[] arrayOfNumbers) {

        return arrayOfNumbers.length == VALID_LENGTH;
    }

    public static String createPhoneNumber(int[] arrayOfNumbers) {

        if (isValid(arrayOfNumbers)) {

            StringBuilder builder = new StringBuilder();
            builder.append("(");

            for (int i = 0; i < arrayOfNumbers.length; i++) {

                if (i == 3) {

                    builder.append(") ");
                    builder.append(arrayOfNumbers[i]);

                } else if (i == 6) {

                    builder.append("-");
                    builder.append(arrayOfNumbers[i]);

                } else builder.append(arrayOfNumbers[i]);
            }
            return builder.toString();
        }
        return null;
    }
}
