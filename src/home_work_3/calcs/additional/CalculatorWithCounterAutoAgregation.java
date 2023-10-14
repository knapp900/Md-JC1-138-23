package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/*
Создать класс CalculatorWithCounterAutoAgregation.
	+8.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
	+8.2 Внутри класса мы должны создавать поле хранящее объект класса калькулятор. Для примера можно использовать любой
	тип калькулятора. Я возьму для примера CalculatorWithMathCopy
	+8.3 Для инициализации данного поля требуется использовать конструктор в который будут передавать CalculatorWithMathCopy.
	+8.4 Данный класс напрямую не умеют считать математику, он умеют делегировать расчёт математики калькулятору который
	сохранён в его поле.
	+8.5 В классах должны присутствовать математические методы:
		8.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		8.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	+8.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	+8.7 Создать класс CalculatorWithCounterDelegateAgregationMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
	из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoAgregation {

    //Переменная калькулятора
    private CalculatorWithMathCopy calculatorWithMathCopy;

    // Переменная счетчика срабатываний методов класса
    private long counter;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
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
        return calculatorWithMathCopy.power(numOne, numTwo);
    }

    /**
     * Возвращает модуль аргумента
     *
     * @param num - значение
     * @return - результат
     */
    public double abs(double num) {
        incrementCountOperation();
        return calculatorWithMathCopy.abs(num);
    }

    /**
     * Возвращает квадратный корень
     *
     * @param num - значение
     * @return - результат
     */
    public double sqrt(double num) {
        incrementCountOperation();
        return calculatorWithMathCopy.sqrt(num);
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
        return calculatorWithMathCopy.add(numOne, numTwo);
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
        return calculatorWithMathCopy.subtract(numOne, numTwo);
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
        return calculatorWithMathCopy.multiply(numOne, numTwo);
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
        return calculatorWithMathCopy.divide(numOne, numTwo);
    }


}
