package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper withCounterAutoSuper = new CalculatorWithCounterAutoSuper();

        double result = withCounterAutoSuper
                .add((withCounterAutoSuper
                        .add(withCounterAutoSuper
                                .multiply(15, 7),withCounterAutoSuper
                                .power((withCounterAutoSuper
                                                .divide(28, 5)), 2))) , 4.1);

        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , withCounterAutoSuper.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
