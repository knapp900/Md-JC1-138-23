package home_work_2.loops;

import java.util.Arrays;
import java.util.Random;

/*
 *1.5. Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
    	1.5.1. Найти наибольшую цифру натурального числа
    	1.5.2. Вероятность четных случайных чисел
    	1.5.3. Посчитать четные и нечетные цифры числа
    	1.5.4. Ряд Фибоначчи
    	1.5.5. Вывести ряд чисел в диапазоне с шагом
    	1.5.6. Переворот числа
 */
public class Task_1_5 {

    public static void main(String[] args) {

        findMaxDigit("1235697655");
        probabilityOfEvenRandomNumbers(new Random(), 100);
        countEvenAndUnevenDigitsOfNumber("222333");
        fib(120);
        printRangeOfNumbersWithStep(2, 32, 6);
        numberReversal("23244");

    }
    //1.5.1. Найти наибольшую цифру натурального числа

    /**
     * Метод находит наибольшую цифру числа
     *
     * @param number строка с числом для поиска
     */
    public static void findMaxDigit(String number) {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            /*
             Операция (-'0') нужна так как в ASCII 0 = 048,1 = 049 и тд.
             Вычитая 048 из полученного символа мы получаем десятичное представление
             */
            if ((number.charAt(i) - '0') > result) {

                result = number.charAt(i) - '0';
            }
        }
        System.out.println("Max digit = " + result);
    }

    //1.5.2. Вероятность четных случайных чисел

    /**
     * Метод в процентах оценивает вероятность четных чисел
     *
     * @param random экземпляр класса Random()
     * @param bound  верхняя граница случайного числа
     */
    public static void probabilityOfEvenRandomNumbers(Random random, int bound) {

        double percentOfRandom = 0;
        double evenNumbers = 0;

        for (int i = 0; i < bound; i++) {

            if (random.nextInt(bound) % 2 == 0) {

                evenNumbers++;
            }

        }
        percentOfRandom = (evenNumbers / bound) * 100;

        System.out.println("Вероятность четных случайных чисел " + percentOfRandom + " %");

    }

    //1.5.3. Посчитать четные и нечетные цифры числа

    /**
     * Считает четные и нечетные цыфры числа и выводит на экран
     *
     * @param number строка с числом для подсчета
     */
    public static void countEvenAndUnevenDigitsOfNumber(String number) {

        int evenDigits = 0;
        int unevenDigits = 0;

        for (int i = 0; i < number.length(); i++) {

            if ((number.charAt(i) - '0') % 2 == 0) {

                evenDigits++;
            } else if (!((number.charAt(i) - '0') % 2 == 0)) {

                unevenDigits++;
            }
        }

        System.out.println("Число " + number + " содержит " + evenDigits + " четных и " + unevenDigits + " нечетных.");
    }

    //1.5.4. Ряд Фибоначчи

    /**
     * Выводит на экран ряд Фибоначчи
     *
     * @param bound верхняя граница ряда Фибоначчи
     */
    public static void fib(int bound) {

        int[] fibArray = new int[bound];  // массив для результатов вычисления числа Фибоначчи
        fibArray[1] = 1;

        for (int i = 2; i < bound; i++) {

            fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
        }

        System.out.println(Arrays.toString(fibArray));
    }

    //1.5.5. Вывести ряд чисел в диапазоне с шагом

    /**
     * Выводит ряд чисел в диапазоне с шагом
     *
     * @param minRange нижняя граница диапазона
     * @param maxRange верхняя граница диапазона
     * @param step     шаг
     */
    public static void printRangeOfNumbersWithStep(int minRange, int maxRange, int step) {

        int[] arrayOfResult = new int[(maxRange - minRange) / step + 1];

        arrayOfResult[0] = minRange;

        for (int i = 1; i < arrayOfResult.length; i++) {

            arrayOfResult[i] = arrayOfResult[i - 1] + step;
        }

        System.out.println(Arrays.toString(arrayOfResult));

    }

    //1.5.6. Переворот числа
    public static void numberReversal(String number) {

        StringBuilder builder = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {

            builder.append(number.charAt(i));
        }

        System.out.println(builder.toString());

    }


}
