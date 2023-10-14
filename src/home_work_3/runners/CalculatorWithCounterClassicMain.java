package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic withCounterClassic = new CalculatorWithCounterClassic();

        double result = withCounterClassic
                .add((withCounterClassic
                        .add(withCounterClassic
                                .multiply(15, 7), withCounterClassic
                                .power((withCounterClassic
                                        .divide(28, 5)), 2))), 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f"
                        , result
                        , withCounterClassic.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
