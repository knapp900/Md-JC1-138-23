package home_work_3.runners;

public class CalculatorWithMathCopyMain {
    public double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    public double subtract(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    public double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    public double divide(double numOne, int numTwo) {
        return numOne / numTwo;
    }

    /*
    Рекурсивный алгоритм возведения в числа в степень
     */
    public double power(double numOne, double numTwo) {
        if (numOne == 1 || numOne == 0) return numOne;
        if (numTwo > 1) return numOne * power(numOne, --numTwo);
        if (numTwo < 1) return 1 / numTwo * power(numOne, ++numTwo);
        return numOne;

    }

    public double abs(double num) {
        return (num < 0) ? -num : num;
    }

    /*
    Алгоритм нахождения квадратного кореня был наГуглен!
     */
    public double sqrt(double num) {
        if (num <= 0) {
            return num;
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
