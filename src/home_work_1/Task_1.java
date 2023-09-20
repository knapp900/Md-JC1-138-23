package home_work_1;

import java.util.Scanner;

/*
1. Побитовые операции:
	Метериал:
	1.1 Создать класс и написать код с вводом двух чисел через консоль и применением побитовых операций И и ИЛИ к этим
	двум числам. Результат операций распечатать.
	1.2 В комментариях напротив каждого ввода значений написать пример выбранного числа в двоичном коде (8 бит), также
	написать комметарии напротив каждой операции на примере этих двух чисел.
	1.3 В отдельном классе попробуйте сделать побитовую операцию с литералом 42.5, опишите результат в комментариях
	в классе с заданием.
 */
public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstDigit;
        int secondDigit;
        System.out.print("Введите первое число: ");
        firstDigit = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondDigit = scanner.nextInt();
        System.out.println(
                "Вы ввели: " + '\n' + firstDigit + " двоичном представлении " + Integer.toBinaryString(firstDigit) +
                        '\n' + secondDigit + " двоичном представлении " + Integer.toBinaryString(secondDigit));

        bitwiseOperations(firstDigit, secondDigit);
        scanner.close();
    }

    public static void bitwiseOperations(int one, int two) { // Число one 12 (1100), число two 13 (1101)

        /*
            1100
            1101
            ----
            1100 В младшем бите (справа) нет полного совпадения разрядов так что результат выполнения И 0
         */
        int and = one & two;
        System.out.println("Результат выполнения побитового И :" + Integer.toBinaryString(and));

        /*
            1100
            1101
            ----
            1100 В младшем бите (справа) есть один положительный разряд так что результат выполнения ИЛИ 1
         */
        int or = one | two;
        System.out.println("Результат выполнения побитового ИЛИ :" + Integer.toBinaryString(or));

    }

}

//class Task_1_1 {
//    /*
//        Побитовая операция применимы только к целым числам (Operator '&' cannot be applied to 'double', 'double')
//     */
//    public static void bitwiseOperations(double one, double two) {
//
//        double and = one & two;
//        System.out.println("Результат выполнения побитового И :" + Integer.toBinaryString(and));
//
//        double or = one | two;
//        System.out.println("Результат выполнения побитового ИЛИ :" + Integer.toBinaryString(or));
//
//    }
//
//}
