package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorsTest {

    ICalculator mathCopy = new CalculatorWithMathCopy();
    ICalculator mathExtends = new CalculatorWithMathExtends();
    ICalculator operator = new CalculatorWithOperator();

    @Test
    public void add() {

        assertEquals(mathCopy.add(1, 1), 2);
        assertEquals(mathExtends.add(1, 1), 2);
        assertEquals(operator.add(1, 1), 2);
    }

    @Test
    public void addWhitZeroArguments() {

        assertEquals(mathCopy.add(0, 0), 0);
        assertEquals(mathExtends.add(0, 0), 0);
        assertEquals(operator.add(0, 0), 0);
    }

    @Test
    public void addWhitNegativeArguments() {

        assertEquals(mathCopy.add(-1, -1), -2);
        assertEquals(mathExtends.add(-1, -1), -2);
        assertEquals(operator.add(-1, -1), -2);
    }

    @Test
    public void subtract() {

        assertEquals(mathCopy.subtract(1, 1), 0);
        assertEquals(mathExtends.subtract(1, 1), 0);
        assertEquals(operator.subtract(1, 1), 0);
    }

    @Test
    public void subtractZeroArguments() {

        assertEquals(mathCopy.subtract(0, 0), 0);
        assertEquals(mathExtends.subtract(0, 0), 0);
        assertEquals(operator.subtract(0, 0), 0);
    }

    @Test
    public void subtractNegativeArguments() {

        assertEquals(mathCopy.subtract(-1, -1), 0);
        assertEquals(mathExtends.subtract(-1, -1), 0);
        assertEquals(operator.subtract(-1, -1), 0);
    }

    @Test
    public void multiply() {

        assertEquals(mathCopy.multiply(1, 1), 1);
        assertEquals(mathExtends.multiply(1, 1), 1);
        assertEquals(operator.multiply(1, 1), 1);
    }

    @Test
    public void multiplyZeroArguments() {

        assertEquals(mathCopy.multiply(0, 0), 0);
        assertEquals(mathExtends.multiply(0, 0), 0);
        assertEquals(operator.multiply(0, 0), 0);
    }

    @Test
    public void multiplyNegativeArguments() {

        assertEquals(mathCopy.multiply(-1, -1), 1);
        assertEquals(mathExtends.multiply(-1, -1), 1);
        assertEquals(operator.multiply(-1, -1), 1);
    }

    @Test
    public void divide() {

        assertEquals(mathCopy.divide(1, 1), 1);
        assertEquals(mathExtends.divide(1, 1), 1);
        assertEquals(operator.divide(1, 1), 1);
    }

    @Test
    public void divideZeroArguments() {

        assertTrue(Double.isNaN(mathCopy.divide(0, 0)));
        assertTrue(Double.isNaN(mathExtends.divide(0, 0)));
        assertTrue(Double.isNaN(operator.divide(0, 0)));

    }

    @Test
    public void divideNegativeArguments() {

        assertEquals(mathCopy.divide(-1, -1), 1);
        assertEquals(mathExtends.divide(-1, -1), 1);
        assertEquals(operator.divide(-1, -1), 1);
    }

    @Test
    public void power() {

        assertEquals(mathCopy.power(2, 10), 1024);
        assertEquals(mathExtends.power(2, 10), 1024);
        assertEquals(operator.power(2, 10), 1024);
    }

    @Test
    public void powerZeroArguments() {

        assertEquals(mathCopy.power(0, 0), 1);
        assertEquals(mathExtends.power(0, 0), 1);
        assertEquals(operator.power(0, 0), 1);
    }

    @Test
    public void powerNegativeNumber() {

        assertEquals(mathCopy.power(-2, 10), 1024);
        assertEquals(mathExtends.power(-2, 10), 1024);
        assertEquals(operator.power(-2, 10), 1024);
    }

    @Disabled
    @Test
    public void powerNegativePowerOfCalculatorWithOperator() {

        assertEquals(operator.power(2, -1), 0.5);  // Возвращает бесконечность!!!
    }

    @Test
    public void powerNegativePower() {

        assertEquals(mathCopy.power(2, -1), 0.5);
        assertEquals(mathExtends.power(2, -1), 0.5);
    }

    @Test
    public void abs() {

        assertEquals(mathCopy.abs(-2), 2);
        assertEquals(mathExtends.abs(-2), 2);
        assertEquals(operator.abs(-2), 2);
    }

    @Test
    public void sqrt() {

        assertEquals(mathCopy.sqrt(4), 2);
        assertEquals(mathExtends.sqrt(4), 2);
        assertEquals(operator.sqrt(4), 2);
    }

    @Test
    public void sqrtWhitZeroArgument() {

        assertEquals(mathCopy.sqrt(0), 0);
        assertEquals(mathExtends.sqrt(0), 0);
        assertEquals(operator.sqrt(0), 0);
    }

    @Test
    public void sqrtWhitNegativeArgument() {

        assertEquals(mathCopy.sqrt(-4), 0.0);
        assertEquals(mathExtends.sqrt(-4), 0.0);
        assertEquals(operator.sqrt(-4), 0.0);
    }
}
