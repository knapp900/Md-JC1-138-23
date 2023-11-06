package home_work_2.loops;

/*
1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о
том что пользователь ввёл некорректные данные.
    1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
    1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
    1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
 */

public class Task_1_2 {
    private String request;
    int[] arrayDigitsOfString;

    public static void main(String[] args) {

        Task_1_2 app = new Task_1_2();
        // Читает аргументы
        for (String arguments : args) app.request = arguments; // Проверка args что это число и оно не начинается с нуля

        if (app.isNumber(app.request)) {
            if (!app.isFlout(app.request)) {

                app.arrayDigitsOfString = app.stringToIntArray(app.request);
                app.printMessage(
                        app.buildAnswer(
                                app.arrayDigitsOfString,app.multiplyingDigitsOfNumber(app.arrayDigitsOfString)));

            } else {

                app.printMessage("Введено не целое число");
            }
        } else {

            app.printMessage("Введено не число");
        }

    }

    /**
     * Метод переводит цифры из строки в массив int
     *
     * @param number строка которую нужно перевести в массив
     * @return массив с результатом
     */
    public int[] stringToIntArray(String number) {

        int[] arrayOfDigitv = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            // charAt ASCII вычитая 48 из результата получаем десятичное представление числа
            arrayOfDigitv[i] = (number.charAt(i) - 48);
        }
        return arrayOfDigitv;
    }

    /**
     * Метод перемножает цифры переданного числа*
     *
     * @param number массив чисел
     * @return long с результатом
     */
    public long multiplyingDigitsOfNumber(int[] number) {

        long result = 1;

        for (int i = 0; i <= number.length-1; i++) {

            result *= number[i];

        }

        return result;
    }

    /**
     * Метод проверяет является ли содержимое строки числом и не равняется нулю
     *
     * @param args = строка для проверки на число
     * @return true если строка содержит число и не начинается с нуля
     */
    public boolean isNumber(String args) {

        return args.matches
                ("^-?[0-9]+$") // Проверяет что в строке только число
                || args.matches("^([0-9]+\\.[0-9]+)$") // Проверяет что в строке только число с точкой
                && args.charAt(0) != '0'; // Проверяет что в строка не начинается с нуля

    }

    /**
     * Метод проверяет является ли число вещественным
     *
     * @param args строка содержащая число для проверки
     * @return true если число с плавающей точкой и false если без
     */
    public boolean isFlout(String args) {

        return  args.matches("^([0-9]+\\.[0-9]+)$");
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
     * Метод выводит результат в консоль в заданном формате (1*2*3=6)
     *
     * @param arrayOfDigit   результат вычисления факториала
     * @param result число из которого вычисляли факториал
     */
    public String buildAnswer(int[] arrayOfDigit, long result) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= arrayOfDigit.length-1; i++) {

            builder.append(arrayOfDigit[i]);
            builder.append('*');

        }

        builder.deleteCharAt(builder.length() - 1);
        builder.append('=');
        builder.append(result);

        return builder.toString();

    }

}
