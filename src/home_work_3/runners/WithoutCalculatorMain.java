package home_work_3.runners;
/*
1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
	1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль.
	Внимание, знак "^" обозначает возведение в степень.
 */
public class WithoutCalculatorMain {

    public static void main(String[] args) {

        double res = 4.1 + 15 * 7 + Math.pow(((double) 28 / 5), 2);  // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f", res);
    }
}
