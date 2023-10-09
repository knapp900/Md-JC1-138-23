package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/*
11. Создать класс CalculatorWithCounterAutoAgregationInterface.
	+11.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам
	пользователь вашего класса.
	+11.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	+11.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	+11.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору
	который передали в конструктор
	+11.5 В классе должны присутствовать все методы объявленные в интерфейсе.
	+11.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований
	данного калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	+11.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения
	из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().

 */
public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calculator;
    private long counter;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
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
        return calculator.power(numOne, numTwo);
    }

    /**
     * Возвращает модуль аргумента
     *
     * @param num - значение
     * @return - результат
     */
    public double abs(double num) {
        incrementCountOperation();
        return calculator.abs(num);
    }

    /**
     * Возвращает квадратный корень
     *
     * @param num - значение
     * @return - результат
     */
    public double sqrt(double num) {
        incrementCountOperation();
        return calculator.sqrt(num);
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
        return calculator.add(numOne, numTwo);
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
        return calculator.subtract(numOne, numTwo);
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
        return calculator.multiply(numOne, numTwo);
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
        return calculator.divide(numOne, numTwo);
    }

}
