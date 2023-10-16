package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorStringExpressionMain {

    public static void main(String[] args) {

        CalculatorStringExpression calculatorStringExpression =
                new CalculatorStringExpression(
                        new CalculatorWithMathCopy());


        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f" + '\n',
                calculatorStringExpression.calculate("4.1 + 15 * 7 + (28 / 5) ^ 2"));

        System.out.printf("Площадь круга: r = 10mm = %.2f" + '\n',
                calculatorStringExpression.calculate("P * (10^2)"));

        System.out.printf("Объем цилиндра: h - 25mm, r - 10mm = %.2f mm^3" + '\n',
                calculatorStringExpression.calculate("25 * (P * (10^2))/4"));

        System.out.printf("E = %.6f" + '\n',
                calculatorStringExpression.calculate("E^((1+1)/2)"));

        System.out.println(calculatorStringExpression.calculate("2 * 2^10"));

        System.out.println(calculatorStringExpression.calculate("2^10 * 2"));
    }

}
