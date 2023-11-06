package home_work_2.loops;

import java.math.BigInteger;

/*
 1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
    1.1.1. Используя только цикл
 */

public class Task_1_1_1 {

    private String request;
    private int iterator;
    private long result;

    public static void main(String[] args) {

        Task_1_1_1 app = new Task_1_1_1();

        app.request = app.getFirstArgument(args); // Читает аргументы

        if (app.isNumber(app.request)) { // Проверка args что это число и оно не начинается с нуля

            app.iterator = app.stringToInt(app.request); // Присваиваем args переменной long

            app.result = app.factorial(app.iterator); // Присваиваем результаты вычисления переменной

            if (app.result != 0) {

                app.printMessage(app.buildAnswer(app.result, app.iterator)); // Выводим в консоль результат

            } else {

                app.printMessage("Число слишком длинное! long is overflow!");
            }

        } else {

            app.printMessage("Введены неверные данные или аргументы пусты");
        }

    }

    /**
     * ATTENTION! может вернуть NULL!
     * Метод возвращает первый аргумент командной строки
     *
     * @param args массив аргументов
     * @return если !null возвращает первый аргумент если null то вернет null
     */
    public String getFirstArgument(String[] args) {

        if (args != null) {

            for (String arguments : args) {

                return arguments;
            }
        }
        return null;
    }

    /**
     * Метод преобразует String to int
     *
     * @param stringOfNumber String содержащий число
     * @return int результат преобразования строки
     */
    public int stringToInt(String stringOfNumber) {

        return Integer.parseInt(stringOfNumber);
    }

    /**
     * Метод высчитывает факториал переданного числа
     *
     * @param number = факториал какого числа нужно найти
     * @return = возвращает 0 если long переполнен и result если вычисление прошло успешно
     */
    public long factorial(int number) {

        long result = 1;

        for (int i = 1; i <= number; i++) {

            result *= i;

            if (!isNotOverflow(result)) {
                return 0;
            }
        }

        return result;
    }

    /**
     * Метод проверяет не переполнен ли long
     *
     * @param number = проверяемое число
     * @return = true если long не переполнен и false если переполнен
     */
    public boolean isNotOverflow(long number) {

        return number < Long.MAX_VALUE && number > 0;
    }

    /**
     * Метод проверяет является ли содержимое строки числом и не равняется нулю и не является null
     *
     * @param args = строка для проверки на число
     * @return true если строка содержит число и не начинается с нуля и не является null
     */
//    private boolean isNumber(String args) {
//
//        if (args == null) {
//
//            return false;
//        }
//
//        return args.matches("^[0-9]+$") && args.charAt(0) != '0';
//    }
    public boolean isNumber(String args) {

        boolean[] arrayFlags = new boolean[args.length()];
        boolean result = false;

        if (args == null || args.charAt(0) == '0') {

            return false;
        }

        for (int i = 0; i < args.length(); i++) {

            if (args.charAt(i) >= '0' && args.charAt(i) <= '9' || args.charAt(i) == '-') {

                arrayFlags[i] = true;
            }
        }

        for (Boolean res : arrayFlags) {

            if (!res) {

                return false;
            } else {

                result = true;
            }
        }

        return result;
    }

    /**
     * Метод выводит на печать любую строку
     *
     * @param message = строка которая должна быть напечатана в консоль
     */
    public void printMessage(String message) {

        System.out.println(message);
    }

    /**
     * Метод формирует ответ в заданном формате (1*2*3=6)
     *
     * @param result   принимает long результат который будет находится после знака равенства
     * @param iterator принимает int количество символов для формирования строки до знака равенства
     * @return возвращает String в заданном формате
     */
    public String buildAnswer(long result, int iterator) {

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= iterator; i++) {

            builder.append(i);
            builder.append('*');

        }

        builder.deleteCharAt(builder.length() - 1);
        builder.append('=');
        builder.append(result);

        return builder.toString();

    }

}
