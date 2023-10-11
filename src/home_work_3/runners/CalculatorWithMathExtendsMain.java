package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends withMathExtends = new CalculatorWithMathExtends();

        double result = withMathExtends
                .add((withMathExtends
                        .add(withMathExtends
                                .multiply(15, 7),withMathExtends
                                .power((withMathExtends
                                                .divide(28, 5)), 2))) , 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f", result); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
