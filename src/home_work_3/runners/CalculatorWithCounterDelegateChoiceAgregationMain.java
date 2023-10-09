package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorOne = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorTwo = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorThree = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAgregation calculator =
                new CalculatorWithCounterAutoChoiceAgregation(calculatorOne);

        double result = calculator
                .add((calculator
                        .add(calculator
                                .multiply(15, 7), calculator
                                .power(
                                        (calculator
                                                .divide(28, 5)), 2))), 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , calculator.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600

        CalculatorWithCounterAutoChoiceAgregation calculator2 =
                new CalculatorWithCounterAutoChoiceAgregation(calculatorTwo);

        result = calculator2
                .add((calculator2
                        .add(calculator2
                                .multiply(15, 7), calculator2
                                .power(
                                        (calculator2
                                                .divide(28, 5)), 2))), 4.1);
        System.out.println();
        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , calculator2.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600


        CalculatorWithCounterAutoChoiceAgregation calculator3 =
                new CalculatorWithCounterAutoChoiceAgregation(calculatorThree);

        result = calculator3
                .add((calculator3
                        .add(calculator3
                                .multiply(15, 7), calculator3
                                .power(
                                        (calculator3
                                                .divide(28, 5)), 2))), 4.1);
        System.out.println();
        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , calculator3.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }

}
