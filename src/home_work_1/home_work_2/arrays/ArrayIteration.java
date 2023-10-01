package home_work_2.arrays;

/*
2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива при помощи
do....while, while, for, foreach. Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole())
получить массив. Все задачи в одном классе, в отдельных методах, в каждом методе используется 4 разных цикла.
Должно получиться 3 метода:
	2.2.1. Вывести все элементы в консоль.
	2.2.2. Вывести каждый второй элемент массива в консоль.
	2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */
public class ArrayIteration {

    /**
     * Метод выводит все элементы массива в консоль
     *
     * @param array int[] для вывода
     */
    public static void printAllElements(int[] array) {

        System.out.println("do....while loop: ");

        int i = 0;

        do {

            System.out.print(array[i] + " ");
            i++;

        } while (i < array.length);

        System.out.println('\n' + "while loop: ");

        i = 0;

        while (i < array.length) {

            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println('\n' + "for loop: ");

        for (int j = 0; j < array.length; j++) {

            System.out.print(array[j] + " ");
        }

        System.out.println('\n' + "foreach loop: ");

        for (int element : array) {

            System.out.print(element + " ");
        }
    }

    /**
     * Метод выводит каждый второй элемент массива в консоль
     *
     * @param array массив для вывода
     */
    public static void printEverySecondElement(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[++i] + " ");
        }
    }

    /**
     * Метод выводит все элементы массива в консоль в обратном порядке
     *
     * @param array массив для вывода
     */
    public static void printElementsInReverseOrder(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }
    }

}
