package home_work_2.arrays;

import java.util.Arrays;

/*
2.4 Задачи в презентации. На сайте есть пояснения по каждой из этих задач. Все задачи в одном классе, в отдельных методах.
Для получения массивов вызывать ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100))
		2.4.1. Сумма четных положительных элементов массива
		2.4.2. Максимальный из элементов массива с четными индексами
		2.4.3. Элементы массива, которые меньше среднего арифметического
		2.4.4. Найти два наименьших (минимальных) элемента массива
		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
		2.4.6. Сумма цифр массива
 */
public class Task_2_4 {

    public static void main(String[] args) {
        compressArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2, 5);
        sumOfArrayDigit(new int[]{55, 5});
        twoMinElementsOfArray(new int[]{1, 0, 2, 12, 33, 34});//bag
        elementsLessArithmeticMean(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        maxElementOfArrayForEvenIndex(new int[]{1, 2, 3, 4, 56, 6, 7, 8, 9, 10});
        sumOfEvenConstituentElementsOfArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

    }

    //     2.4.1. Сумма четных положительных элементов массива
    public static int sumOfEvenConstituentElementsOfArray(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0 && (array[i] % 2 == 0)) {

                sum += array[i];
            }
        }

        return sum;
    }

    //    2.4.2. Максимальный из элементов массива с четными индексами
    public static int maxElementOfArrayForEvenIndex(int[] array) {

        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {

            if ((i % 2 == 0) && array[i] > maxValue) {

                maxValue = array[i];
            }
        }

        return maxValue;
    }

    //    2.4.3. Элементы массива, которые меньше среднего арифметического
    public static int[] elementsLessArithmeticMean(int[] array) {

        int sumAllElements = 0;
        int arithmeticMean;
        int[] result;

        for (int i = 0; i < array.length; i++) {

            sumAllElements += array[i];
        }

        arithmeticMean = sumAllElements / array.length;

        result = new int[arithmeticMean];

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= arithmeticMean) {

                System.out.print(result[i] = array[i]);
            }
        }
        return result;
    }

    //    2.4.4. Найти два наименьших (минимальных) элемента массива
    public static int[] twoMinElementsOfArray(int[] array) {

        int [] arrayResult = new int[2];
        int min = array[0];
        int previousMin = min;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min ) {

                previousMin = min;
                min = array[i];

            }
        }

        arrayResult[0] = previousMin;
        arrayResult[1] = min;

        return arrayResult;
    }

    //	  2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static int[] compressArray(int[] array, int minBoundOfRange, int maxBoundOfRange) {

        int increment;
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= minBoundOfRange && array[i] <= maxBoundOfRange) {

                array[i] = 0;

            }

        }

        increment = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {

                result[increment] = array[i];

                increment++;
            }
        }
        return result;
    }


    //	  2.4.6. Сумма цифр массива
    public static int sumOfArrayDigit(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            int number = array[i];

            while (number > 0) {

                sum += number % 10;
                number /= 10;
            }
        }

        return sum;
    }
}
