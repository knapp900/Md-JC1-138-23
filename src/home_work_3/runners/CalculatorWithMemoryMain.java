package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

/*
12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих в
	просчёте, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения
	из памяти записанного значения.
 */
public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        calculator
                .add((calculator
                        .add(calculator
                                .multiply(15, 7),calculator
                                .power(
                                        (calculator
                                                .divide(28, 5)), 2))) , 4.1);
        calculator.save();

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f", calculator.load());

    }
}
