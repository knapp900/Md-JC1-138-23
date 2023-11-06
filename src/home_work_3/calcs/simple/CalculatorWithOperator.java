package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/*
2. Создать класс CalculatorWithOperator.
	+2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
	+2.2 В классе должны присутствовать математические методы:
		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение)
		каждый из этих методов должен принимать два параметра (определитесь с их типами) и должны возвращать результат
		(определиться с возвращаемым типом результата) при помощи ключевого слово return.
		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
	+2.3 В методах можно использовать любые арифметические операторы.
	+2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой,
	то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
	+2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод).
	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
	выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithOperator implements ICalculator {
    /**
     * Возвращает сумму аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение
     * @return - результат
     */
    public double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    /**
     * Возвращает разницу аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение, которое нужно вычесть из первого
     * @return - результат
     */
    public double subtract(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    /**
     * Возвращает произведение аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение
     * @return - результат
     */
    public double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    /**
     * Делит первый аргумент на второй
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение, на которое будет делиться первое
     * @return - результат
     */
    public double divide(double numOne, int numTwo) {
        return numOne / numTwo;
    }

    /**
     * Возведение в целую степень дробного положительного числа
     *
     * @param numOne - первое значение которое будет возводиться в степень
     * @param numTwo - второе значение, степень первого значения
     * @return - результат
     */
    public double power(double numOne, double numTwo) {

        if (numOne == 0 && numTwo == 0) {
            return 1;
        }
        if (numOne == 1 || numOne == 0) return numOne;
        if (numTwo > 1) return numOne * power(numOne, --numTwo);
        if (numTwo < 1) return 1 / numTwo * power(numOne, ++numTwo);
        return numOne;

    }


    /**
     * Возвращает модуль аргумента
     *
     * @param num - значение
     * @return - результат
     */
    public double abs(double num) {
        return (num < 0) ? -num : num;
    }

    /**
     * Возвращает квадратный корень
     *
     * @param num - значение
     * @return - результат
     */
    public double sqrt(double num) {
        if (num <= 0) {
            return 0;
        }
        // Инициализируем начальное приближение
        double guess = num / 2;
        // Цикл продолжается до тех пор, пока разница между guess и sqrt(num) не станет меньше заданной точности
        while (abs(guess * guess - num) > 0.000001) {
            // Обновляем приближение
            guess = (guess + num / guess) / 2;
        }
        // Возвращаем приближение
        return guess;
    }
}

