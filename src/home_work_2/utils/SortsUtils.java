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
        System.out.print(Arrays.toString(arr));
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

        System.out.print(Arrays.toString(arr));
    }

//    public static void shakeSort(int[] arr) {
//        int left = 0, right = count - 1; // левая и правая границы сортируемой области массива
//        int flag = 1;  // флаг наличия перемещений
//        // Выполнение цикла пока левая граница не сомкнётся с правой
//        // и пока в массиве имеются перемещения
//        while ((left < right) && flag > 0)
//        {
//            flag = 0;
//            for (int i = left; i<right; i++)  //двигаемся слева направо
//            {
//                if (mass[i]>mass[i + 1]) // если следующий элемент меньше текущего,
//                {             // меняем их местами
//                    double t = mass[i];
//                    mass[i] = mass[i + 1];
//                    mass[i + 1] = t;
//                    flag = 1;      // перемещения в этом цикле были
//                }
//            }
//            right--; // сдвигаем правую границу на предыдущий элемент
//            for (int i = right; i>left; i--)  //двигаемся справа налево
//            {
//                if (mass[i - 1]>mass[i]) // если предыдущий элемент больше текущего,
//                {            // меняем их местами
//                    double t = mass[i];
//                    mass[i] = mass[i - 1];
//                    mass[i - 1] = t;
//                    flag = 1;    // перемещения в этом цикле были
//                }
//            }
//            left++; // сдвигаем левую границу на следующий элемент
//        }
//    }
//    int main() {
//        double m[10];
//        // Вводим элементы массива
//        for (int i = 0; i<10; i++) {
//            printf("m[%d]=", i);
//            scanf("%lf", &m[i]);
//        }
//        shekerSort(m, 10); // вызываем функцию сортировки
//        // Выводим отсортированные элементы массива
//        for (int i = 0; i<10; i++)
//            printf("%.2lf ", m[i]);
//        getchar(); getchar();
//        return 0;
//    }
}