package home_work_2.loops;

import java.util.Arrays;

/*
1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
    1.4.1. 3 = [4052555153018976267, -6289078614652622815]
  	1.4.2. 188 = [1560496482665168896, -1774566438301073408]
  	       -18 = [-9223372036854775808, 0]
   	1.4.3. -19 = бесконечный цикл. Переполнения не происходит
   	1.4.4. Да и вообще на любое целочисленное
 */
public class Task_1_4 {
    private static final int LENGTH_OF_OVERFLOW_RESULT_ARRAY = 2;

    public static void main(String[] args) {
        Task_1_4 app = new Task_1_4();

        System.out.println(Arrays.toString(app.longOverflowFilling(-18)));
    }

    /**
     * Метод перемножает long=1L на переданное число и в случае переполнения возвращает
     * значением до переполнения и после переполнения
     *
     * @param number int множитель
     * @return long[] в ячейке 0 значением до переполнения в ячейке 1 значением после переполнения
     */
    private long[] longOverflowFilling(int number) {

        long[] resultArray = new long[LENGTH_OF_OVERFLOW_RESULT_ARRAY];
        long previousResult = 0;
        long result = 1L;
        boolean isPositiveNumber;

        isPositiveNumber = number > 0 ? true : false;

        for (int i = 0; ; i++) {

            result *= number;
            resultArray[1] = result;

            if (isOverflow(result, isPositiveNumber)) {

                break;
            }
            previousResult = result;
            resultArray[0] = previousResult;
        }

        return resultArray;
    }

    /**
     * Метод проверяет переполнен ли long
     *
     * @param number     проверяемое число
     * @param isPositive диапазон проверки true-если проверяем верхнюю границу long
     *                   false-если проверяем нижнюю границу long
     * @return true если переполнен false если нет
     */
    public boolean isOverflow(long number, boolean isPositive) {

        if (!isPositive) {

            return number < Long.MIN_VALUE || number == 0;
        }

        return number < 0;

    }

}
