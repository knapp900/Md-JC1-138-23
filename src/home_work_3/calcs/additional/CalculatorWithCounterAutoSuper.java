package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/*
6. Создать класс CalculatorWithCounterAutoSuper.
	+6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
	+6.2 Данный класс наследует класс CalculatorWithMathExtends.
	6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть
	реализован механизм учёта их использования (учёт общий для всех методов класса), а вместо реализации математики
	при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали метод plus(7, 3) который должен
	сложить два числа и вернуть результат сложения. Внутри метода plus() пишем реализацию учета, а после делаем вызов
	super.plus(7, 3). Использование super позволит вызвать реализацию из родительского класса.
	+6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
	+6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
	требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1.
	Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counter;


    public CalculatorWithCounterAutoSuper() {
        super();
        counter = 0;

    }

    @Override
    public double power(double numOne, double numTwo) {
        incrementCountOperation();
        return super.power(numOne, numTwo);
    }

    @Override
    public double abs(double num) {
        incrementCountOperation();
        return super.abs(num);
    }

    @Override
    public double sqrt(double num) {
        incrementCountOperation();
        return super.sqrt(num);
    }

    @Override
    public double add(double numOne, double numTwo) {
        incrementCountOperation();
        return super.add(numOne, numTwo);
    }

    @Override
    public double subtract(double numOne, double numTwo) {
        incrementCountOperation();
        return super.subtract(numOne, numTwo);
    }

    @Override
    public double multiply(double numOne, double numTwo) {
        incrementCountOperation();
        return super.multiply(numOne, numTwo);
    }

    @Override
    public double divide(double numOne, int numTwo) {
        incrementCountOperation();
        return super.divide(numOne, numTwo);
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
}
