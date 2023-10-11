package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator whitOperator = new CalculatorWithOperator();

        double result = whitOperator
                .add((whitOperator
                        .add(whitOperator
                                .multiply(15, 7),whitOperator
                                .power((whitOperator
                                                .divide(28, 5)), 2))) , 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f",result); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600

    }
}
