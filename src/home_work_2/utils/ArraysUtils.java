package home_work_2.utils;

import java.util.Scanner;

public class ArraysUtils {

    /*
    2.1. Создать класс ArraysUtils. В этом классе не должно быть main метода. В этом классе написать следующие методы:
		2.1.1. Написать метод public static int[] arrayFromConsole().
		Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
     */

    /**
     * Метод создает массив запрашивая у пользователя размер и элементы массива
     * если размер массива больше введенных элементов то недостающие значения будут
     * проинициализированы нулями
     *
     * @return int[]
     */
    public static int[] arrayFromConsole() {

        int[] resultArray = null;
        int[] temp;
        int size;

        String consoleLineOne;
        String consoleLineTwo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        consoleLineOne = scanner.nextLine();
        System.out.print('\n' + "Введите элементы массива через пробел: ");
        consoleLineTwo = scanner.nextLine();

        if (Utils.isNumber(consoleLineOne)) {

            size = Utils.stringToInt(consoleLineOne);

            if (Utils.isNumberWithSpaces(consoleLineTwo)) {

                temp = new int[size];
                String[] valuesOfArray = consoleLineTwo.split(" ");

                if (valuesOfArray.length <= size) {
                    for (int i = 0; i < temp.length; i++) {
                        if (valuesOfArray.length - 1 >= i) {

                            temp[i] = Utils.stringToInt(valuesOfArray[i]);
                        } else if (valuesOfArray.length - 1 < i) {

                            temp[i] = 0;
                        }

                    }
                } else {

                    System.out.println("Длинна массива меньше количества значений которые вы ввели!");
                }

                resultArray = new int[size];

                System.arraycopy(temp, 0, resultArray, 0, temp.length);

            }
        } else {

            System.out.println("Попробуйте еще раз!");
        }
        return resultArray;
    }


    /*
    2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion).
    Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
    Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
     */

    /**
     * Метод для генерации масива со случайными числами
     *
     * @param size              int размер массива
     * @param maxValueExclusion int максимальная величина случайного числа
     * @return int[] массив со случайными значениями
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] arr = new int[size];
        long seed;
        int randomValue = 0;

        if (maxValueExclusion > 0) {

            for (int i = 0; i < arr.length; i++) {

                seed = System.nanoTime();
                randomValue = (int) ((seed + System.nanoTime()) % (maxValueExclusion + 1));
                arr[i] = randomValue;

            }
        }

        return arr;
    }
}

class Utils {
    /**
     * Метод проверяет является ли содержимое строки числом и не равняется нулю
     *
     * @param args = строка для проверки на число
     * @return true если строка содержит число и не начинается с нуля
     */
    public static boolean isNumber(String args) {

        if (args == null) {

            return false;
        }

        return args.matches("^-?[0-9]+$") && args.charAt(0) != '0';
    }

    /**
     * Метод проверяет является ли содержимое строки числом разделенными пробелами
     *
     * @param args = строка для проверки на число
     * @return true если строка содержит числа через пробел
     */
    public static boolean isNumberWithSpaces(String args) {

        if (args == null) {

            return false;
        }

        return args.matches("^\\s?-?[0-9\\s]+$");
    }

    /**
     * Метод преобразует String to int
     *
     * @param stringOfNumber String содержащий число
     * @return int результат преобразования строки
     */
    public static int stringToInt(String stringOfNumber) {

        return Integer.parseInt(stringOfNumber);
    }


}
