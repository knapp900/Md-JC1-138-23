package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/*
12*. Создать CalculatorWithMemory используя аналогичные принципы построения класса CalculatorWithCounterAutoAgregationInterface.
	+12.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его
	дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
	+12.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	+12.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
	+12.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики калькулятору который
	передали в конструктор
	+12.5 В классе должны присутствовать математические методы:
		12.5.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
		12.5.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
	+12.6 Функция памяти работает через методы:
		12.6.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть
		параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический. Пример void save();
		12.6.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи
		нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не
		автоматический. Пример double load();
	+12.7 В этом калькуляторе НЕТ ФУНКЦИИ ПОДСЧЁТА количества использований
	+12.8 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих в
	просчёте, а также результатов работы методов калькулятора, можно использовать только литералы и метод получения
	из памяти записанного значения.

 */
public class CalculatorWithMemory implements ICalculator {

    // Переназначается результатом выполнения всех методов
    private double lastOfMethodResult;
    // Сохраненное значение
    private double savedValue;
    private ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
        savedValue = 0;
        lastOfMethodResult = 0;
    }

    /**
     * Сохраняет результат последнего вызванного метода
     */
    public void save() {
        savedValue = lastOfMethodResult;
    }

    /**
     * Возвращает сохраненный результат калькулятора и сбрасывает результат на ноль
     *
     * @return - результат
     */
    public double load() {
        double result = savedValue;
        savedValue = 0;
        return result;
    }

    @Override
    public double add(double numOne, double numTwo) {

        return lastOfMethodResult = calculator.add(numOne, numTwo);
    }

    @Override
    public double subtract(double numOne, double numTwo) {
        return lastOfMethodResult = calculator.subtract(numOne, numTwo);
    }

    @Override
    public double multiply(double numOne, double numTwo) {
        return lastOfMethodResult = calculator.multiply(numOne, numTwo);
    }

    @Override
    public double divide(double numOne, int numTwo) {
        return lastOfMethodResult = calculator.divide(numOne, numTwo);
    }

    @Override
    public double power(double numOne, double numTwo) {
        return lastOfMethodResult = calculator.power(numOne, numTwo);
    }

    @Override
    public double abs(double num) {
        return lastOfMethodResult = calculator.abs(num);
    }

    @Override
    public double sqrt(double num) {
        return lastOfMethodResult = calculator.sqrt(num);
    }
}
