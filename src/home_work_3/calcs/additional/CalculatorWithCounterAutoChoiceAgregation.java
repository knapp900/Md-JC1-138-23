package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/*
9. Создать класс CalculatorWithCounterAutoChoiceAgregation.
	+9.1 Все методы объявленные в данных классах НЕ статические (не имеют модификатор static).
	+9.2 В данном классе должны быть следующие варианты конструктора:
		9.2.1 Принимающий объект типа CalculatorWithOperator
		9.2.2 Принимающий объект типа CalculatorWithMathCopy
		9.2.3 Принимающий объект типа CalculatorWithMathExtends
	+9.4 Данные класс также не умеет напрямую считать математику, они умеют делегировать расчёт математики калькулятору
	который передали в конструктор.
	+9.5 В классах должны присутствовать математические методы:
		9.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		9.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	+9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	+9.7 Создать класс CalculatorWithCounterDelegateChoiceAgregationMain в котором будет точка входа (main метод).
	В main методе требуется:
		9.7.1 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithOperator и используя методы
		из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и
		результат метода getCountOperation().
		9.7.2 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathCopy и используя методы
		из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и
		результат метода getCountOperation().
		9.7.3 Создать экземпляр калькулятора используя конструктор принимающий CalculatorWithMathExtends и используя
		методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результаты посчитанных
		выражений и результат метода getCountOperation().

 */
public class CalculatorWithCounterAutoChoiceAgregation {

    /*
    Переменные калькуляторов которые могут быть использованы в классе
     */
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    // Переменная счетчика срабатываний методов класса
    private long counter;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
        counter = 0;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
        counter = 0;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
        counter = 0;
    }

    /**
     * Увеличивает значение счетчика на 1
     */
    private void incrementCountOperation() {
        this.counter++;
    }

    /**
     * Счетчик колличества сробатывания методов
     *
     * @return - результат
     */
    public long getCountOperation() {
        return counter;
    }

    /**
     * Возведение в целую степень дробного положительного числа
     *
     * @param numOne - первое значение которое будет возводиться в степень
     * @param numTwo - второе значение, степень первого значения
     * @return - результат
     */
    public double power(double numOne, double numTwo) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.power(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.power(numOne, numTwo);
        }
        return calculatorWithOperator.power(numOne, numTwo);
    }

    /**
     * Возвращает модуль аргумента
     *
     * @param num - значение
     * @return - результат
     */
    public double abs(double num) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(num);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.abs(num);
        }
        return calculatorWithOperator.abs(num);
    }

    /**
     * Возвращает квадратный корень
     *
     * @param num - значение
     * @return - результат
     */
    public double sqrt(double num) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(num);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sqrt(num);
        }
        return calculatorWithOperator.sqrt(num);
    }

    /**
     * Возвращает сумму аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение
     * @return - результат
     */
    public double add(double numOne, double numTwo) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.add(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.add(numOne, numTwo);
        }
        return calculatorWithOperator.add(numOne, numTwo);
    }

    /**
     * Возвращает разницу аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение, которое нужно вычесть из первого
     * @return - результат
     */
    public double subtract(double numOne, double numTwo) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtract(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.subtract(numOne, numTwo);
        }
        return calculatorWithOperator.subtract(numOne, numTwo);
    }

    /**
     * Возвращает произведение аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение
     * @return - результат
     */
    public double multiply(double numOne, double numTwo) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.multiply(numOne, numTwo);
        }
        return calculatorWithOperator.multiply(numOne, numTwo);
    }

    /**
     * Делит первый аргумент на второй
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение, на которое будет делиться первое
     * @return - результат
     */
    public double divide(double numOne, int numTwo) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.divide(numOne, numTwo);
        }
        return calculatorWithOperator.divide(numOne, numTwo);
    }

}
