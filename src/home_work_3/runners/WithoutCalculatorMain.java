package home_work_3.runners;

public class WithoutCalculatorMain {

    public static void main(String[] args) {
        double res = 4.1 + 15 * 7 + Math.pow(((double) 28 / 5), 2);  // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f", res);
    }
}
