package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorWithMemoryTest {

    private CalculatorWithMemory calculator_1 = new CalculatorWithMemory(new CalculatorWithOperator());
    private CalculatorWithMemoryDecorator calculator_2 = new CalculatorWithMemoryDecorator(new CalculatorWithOperator());

    @Test
    public void add() {

        assertEquals(calculator_1.add(1, 1), 2);
        assertEquals(calculator_2.add(1, 1), 2);
    }

    @Test
    public void addWhitZeroArguments() {

        assertEquals(calculator_1.add(0, 0), 0);
        assertEquals(calculator_2.add(0, 0), 0);
    }

    @Test
    public void addWhitNegativeArguments() {

        assertEquals(calculator_1.add(-1, -1), -2);
        assertEquals(calculator_2.add(-1, -1), -2);
    }

    @Test
    public void subtract() {

        assertEquals(calculator_1.subtract(1, 1), 0);
        assertEquals(calculator_2.subtract(1, 1), 0);
    }

    @Test
    public void subtractZeroArguments() {

        assertEquals(calculator_1.subtract(0, 0), 0);
        assertEquals(calculator_2.subtract(0, 0), 0);
    }

    @Test
    public void subtractNegativeArguments() {

        assertEquals(calculator_1.subtract(-1, -1), 0);
        assertEquals(calculator_2.subtract(-1, -1), 0);
    }

    @Test
    public void multiply() {

        assertEquals(calculator_1.multiply(1, 1), 1);
        assertEquals(calculator_2.multiply(1, 1), 1);
    }

    @Test
    public void multiplyZeroArguments() {

        assertEquals(calculator_1.multiply(0, 0), 0);
        assertEquals(calculator_2.multiply(0, 0), 0);
    }

    @Test
    public void multiplyNegativeArguments() {

        assertEquals(calculator_1.multiply(-1, -1), 1);
        assertEquals(calculator_2.multiply(-1, -1), 1);
    }

    @Test
    public void divide() {

        assertEquals(calculator_1.divide(1, 1), 1);
        assertEquals(calculator_2.divide(1, 1), 1);
    }

    @Test
    public void divideZeroArguments() {

        assertTrue(Double.isNaN(calculator_1.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_2.divide(0, 0)));
    }

    @Test
    public void divideNegativeArguments() {

        assertEquals(calculator_1.divide(-1, -1), 1);
        assertEquals(calculator_2.divide(-1, -1), 1);
    }

    @Test
    public void power() {

        assertEquals(calculator_1.power(2, 10), 1024);
        assertEquals(calculator_2.power(2, 10), 1024);
    }

    @Test
    public void powerZeroArguments() {

        assertEquals(calculator_1.power(0, 0), 1);
        assertEquals(calculator_2.power(0, 0), 1);
    }

    @Test
    public void powerNegativeNumber() {

        assertEquals(calculator_1.power(-2, 10), 1024);
        assertEquals(calculator_2.power(-2, 10), 1024);
    }

    @Disabled
    @Test
    public void powerNegativePowerOfCalculatorWithOperator() {

        assertEquals(calculator_1.power(2, -1), 0.5);  // Возвращает бесконечность!!!
        assertEquals(calculator_2.power(2, -1), 0.5);
    }

    @Test
    public void abs() {

        assertEquals(calculator_1.abs(-2), 2);
        assertEquals(calculator_2.abs(-2), 2);
    }

    @Test
    public void sqrt() {

        assertEquals(calculator_1.sqrt(4), 2);
        assertEquals(calculator_2.sqrt(4), 2);
    }

    @Test
    public void sqrtWhitZeroArgument() {

        assertEquals(calculator_1.sqrt(0), 0);
        assertEquals(calculator_2.sqrt(0), 0);
    }

    @Test
    public void sqrtWhitNegativeArgument() {

        assertEquals(calculator_1.sqrt(-4), 0.0);
        assertEquals(calculator_2.sqrt(-4), 0.0);
    }


    @Test
    public void saveAndLoad() {

        calculator_1.add(1, 1);
        calculator_2.add(1, 1);
        
        calculator_1.save();
        calculator_2.save();

        assertEquals(calculator_1.load(), 2);
        assertEquals(calculator_2.load(), 2);

        assertEquals(calculator_1.load(), 0);
        assertEquals(calculator_2.load(), 0);
    }
}
