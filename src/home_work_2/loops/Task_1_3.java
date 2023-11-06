package home_work_2.loops;

import java.util.Scanner;

/*
 * 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число
 * которое мы будем возводить, Второе число это степень в которую возводят первое число.
 * Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным.
 * Math использовать нельзя.
 *  1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
 *  1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */
public class Task_1_3 {
    private static final int LENGTH_OF_POWER_NUMBERS_ARRAY = 2;
    private int[] numbers;

    public static void main(String[] args) {

        Task_1_3 app = new Task_1_3();

        Scanner scanner = new Scanner(System.in);

        String line;

        System.out.print("Введите число которое хотите возвести в степень и степень через пробел например: 18 5: ");

        line = scanner.nextLine();

        if (app.isNumber(line)) {

            app.numbers = app.stringToIntArray(line);

            if (app.powerNumberValidation(app.numbers[1])) {

                app.printMessage(app.customPow(app.numbers[0], app.numbers[1]));
            } else {

                app.printMessage("Вы ввели нулевую или отрицательную степень");
            }

        } else {

            app.printMessage("Неверный ввод!");
        }

    }

    /**
     * Метод проверяет является ли содержимое строки числом и не равняется нулю
     *
     * @param args = строка для проверки на число
     * @return true если строка содержит число и не начинается с нуля
     */
    public boolean isNumber(String args) {

        if (args == null) {

            return false;
        }

        return args.matches("^-?[0-9]+\\s-?[0-9]+$") && args.charAt(0) != '0';
    }

    /**
     * Метод возводит в степень переданное число
     *
     * @param number число возводимое в степень
     * @param power  степень
     * @return double результат
     */
    public double customPow(double number, int power) {

        double result = 1;

        for (int i = 0; i < power; i++) {

            result *= number;
        }

        return result;
    }

    /**
     * Метод преобразует String to int[]
     *
     * @param stringOfNumber String содержащий числа
     * @return int[] результат преобразования строки
     */
    public int[] stringToIntArray(String stringOfNumber) {

        String[] response = stringOfNumber.split("\\s");

        int[] array = new int[LENGTH_OF_POWER_NUMBERS_ARRAY];

        array[0] = Integer.parseInt(response[0]);
        array[1] = Integer.parseInt(response[1]);

        return array;
    }

    /**
     * Метод проверяет является число положительным и не нулем
     *
     * @param num int число для проверки
     * @return true если число больше нуля
     */
    public boolean powerNumberValidation(int num) {

        return num > 0;
    }

    /**
     * Метод выводит на печать любую строку
     *
     * @param message = строка которая должна быть напечатана в консоль
     */
    private void printMessage(String message) {

        System.out.println(message);
    }

    /**
     * Метод выводит на печать double
     *
     * @param message double который должен быть напечатан в консоль
     */
    private void printMessage(double message) {

        System.out.println(message);
    }
}
