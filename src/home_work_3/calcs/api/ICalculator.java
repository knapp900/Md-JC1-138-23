package home_work_3.calcs.api;

/**
 * Интерфейс калькулятора, тут изложены основные методы для работы калькулятора.
 */
public interface ICalculator {
    /**
     * Возвращает сумму аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение
     * @return - результат
     */
    double add(double numOne, double numTwo);

    /**
     * Возвращает разницу аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение, которое нужно вычесть из первого
     * @return - результат
     */
    double subtract(double numOne, double numTwo);

    /**
     * Возвращает произведение аргументов
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение
     * @return - результат
     */
    double multiply(double numOne, double numTwo);

    /**
     * Делит первый аргумент на второй
     *
     * @param numOne - первое значение
     * @param numTwo - второе значение, на которое будет делиться первое
     * @return - результат
     */
    double divide(double numOne, int numTwo);

    /**
     * Возведение в целую степень дробного положительного числа
     *
     * @param numOne - первое значение которое будет возводиться в степень
     * @param numTwo - второе значение, степень первого значения
     * @return - результат
     */
    double power(double numOne, double numTwo);

    /**
     * Возвращает модуль аргумента
     *
     * @param num - значение
     * @return - результат
     */
    double abs(double num);

    /**
     * Возвращает квадратный корень
     *
     * @param num - значение
     * @return - результат
     */
    double sqrt(double num);
}
