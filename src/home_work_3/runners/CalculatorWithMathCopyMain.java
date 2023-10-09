package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy withMathCopy = new CalculatorWithMathCopy();

        double result = withMathCopy.add( (withMathCopy.multiply(15,7) + withMathCopy.power((withMathCopy.divide(28,5)),2)), 4.1);

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f",result); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
