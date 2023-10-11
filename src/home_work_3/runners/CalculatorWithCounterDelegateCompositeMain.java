package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite counterAutoComposite = new CalculatorWithCounterAutoComposite();

        double result = counterAutoComposite
                .add((counterAutoComposite
                        .add(counterAutoComposite
                                .multiply(15, 7),counterAutoComposite
                                .power((counterAutoComposite
                                                .divide(28, 5)), 2))) , 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , counterAutoComposite.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
