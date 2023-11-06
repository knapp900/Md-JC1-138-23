package home_work_2.utils;

import java.util.Arrays;

/*
4. Выполнить сортировку массива с числами:
	4.1. Создать класс SortsUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
		4.1.1. Написать метод public static void sort(int[] arr).
		Данный метод будет сортировать переданный ему массив при помощи алгоритма пузырьковая сортировка.
		Описание алгоритма: https://prog-cpp.ru/sort-bubble/
		4.1.2. Написать метод public static void shake(int[] arr).
		Данный метод будет сортировать переданный ему массив при помощи алгоритма шейкерная сортировка.
		Описание алгоритма: https://prog-cpp.ru/sort-shaker/
 */
public class SortsUtils {
    /**
     * Метод сортирует переданный массив пузырьковой сортировкой
     *
     * @param arr int[] для сортировки
     */
    public static void sort(int[] arr) {

        int temp;
        boolean isSorted = false;

        while (!isSorted) {

            isSorted = true;

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] < arr[i - 1]) {

                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                    isSorted = false;
                }
            }
        }

    }

    /**
     * Метод сортирует переданный массив шейкерной сортировкой
     *
     * @param arr int[] для сортировки
     */
    public static void shake(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Сортируем массив слева направо, перемещая наибольший элемент вправо.
            for (int i = left; i < right; i++) {

                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            right--;

            // Сортируем массив справа налево, перемещая наименьший элемент влево.
            for (int i = right; i > left; i--) {

                if (arr[i] < arr[i - 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }

            left++;
        }

    }
    
}