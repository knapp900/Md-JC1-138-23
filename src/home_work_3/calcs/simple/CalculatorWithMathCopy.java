package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/*
3. Создать класс CalculatorWithMathCopy.
	+3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	+3.2 В классе должны присутствовать математические методы:
		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		Скопировать базовые математические операции из CalculatorWithOperator.
		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
	+3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра
	посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithMathCopy implements ICalculator {
    public double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    public double subtract(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    public double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    public double divide(double numOne, int numTwo) {return numOne / numTwo;}

    public double power(double numOne, double numTwo) { return Math.pow(numOne, numTwo); }

    public double abs(double num) { return Math.abs(num); }

    public double sqrt(double num) {

        if (num <= 0) {
            return 0;
        }

        return Math.sqrt(num); }
}
