package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic withCounterClassic = new CalculatorWithCounterClassic();

        double result;
        double temp;

        result = withCounterClassic.divide(28, 5);
        withCounterClassic.incrementCountOperation();

        result = withCounterClassic.power(result,2);
        withCounterClassic.incrementCountOperation();

        temp = withCounterClassic.multiply(15, 7);
        withCounterClassic.incrementCountOperation();

        result = withCounterClassic.add(result,temp);
        withCounterClassic.incrementCountOperation();

        result = withCounterClassic.add(result,4.1);
        withCounterClassic.incrementCountOperation();


        System.out.printf
                ("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f. Колличество вызавов методов класса : %d"
                        , result
                        , withCounterClassic.getCountOperation()); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.4600
    }
}
