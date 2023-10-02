package home_work_2.loops;

import java.math.BigInteger;

/*
1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
 Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
 Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 */

public class Task_1_1_BInt {
    private String request;
    private int iterator;

    public static void main(String[] args) {

        Task_1_1_BInt app = new Task_1_1_BInt();

        app.request = app.getFirstArgument(args);  // Читает аргументы

        if (app.isNumber(app.request)) {  // Проверка args что это число и оно не начинается с нуля

            app.iterator = app.stringToInt(app.request);  // Присваиваем args переменной long

            System.out.println(app.buildAnswer(app.factorial(app.iterator), app.iterator));

        } else {

            System.out.println("Введены неверные данные или аргументы пусты");
        }

    }

    /**
     * ATTENTION! может вернуть NULL!
     * Метод возвращает первый аргумент командной строки
     *
     * @param args массив аргументов
     * @return если !null возвращает первый аргумент если null то вернет null
     */
    private String getFirstArgument(String[] args) {

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
    private int stringToInt(String stringOfNumber) {

        return Integer.parseInt(stringOfNumber);
    }

    /**
     * Метод высчитывает факториал переданного числа
     *
     * @param number = факториал какого числа нужно найти
     * @return = BigInteger result
     */
    private BigInteger factorial(int number) {

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {

            result = result.multiply(BigInteger.valueOf(i));

        }

        return result;
    }

    /**
     * Метод проверяет является ли содержимое строки числом и не равняется нулю и не является null
     *
     * @param args = строка для проверки на число
     * @return true если строка содержит число и не начинается с нуля и не является null
     */
    private boolean isNumber(String args) {

        if (args == null) {

            return false;
        }

        return args.matches("^[0-9]+$") && args.charAt(0) != '0';
    }

    /**
     * Метод формирует ответ в заданном формате (1*2*3=6)
     *
     * @param result   принимает BigInteger результат который будет находится после знака равенства
     * @param iterator принимает int количество символов для формирования строки до знака равенства
     * @return возвращает String в заданном формате
     */
    private String buildAnswer(BigInteger result, int iterator) {

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
