package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

//        ICalculator calculator = new CalculatorWithMathCopy();
//        ICalculator calculator = new CalculatorWithMathExtends();
        ICalculator calculator = new CalculatorWithOperator();

        CalculatorWithCounterAutoAgregationInterface calculatorInterface =
                new CalculatorWithCounterAutoAgregationInterface(calculator);

        double result = calculatorInterface
                .add((calculatorInterface
                        .add(calculatorInterface
                                .multiply(15, 7), calculatorInterface
                                .power((calculatorInterface
                                                .divide(28, 5)), 2))), 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , calculatorInterface.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
