package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy mathCopy = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation autoAgregation = new CalculatorWithCounterAutoAgregation(mathCopy);


        double result = autoAgregation
                .add((autoAgregation
                        .add(autoAgregation
                                .multiply(15, 7),autoAgregation
                                .power((autoAgregation
                                                .divide(28, 5)), 2))) , 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , autoAgregation.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }

}
