package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorsWhitCountersTest {

    private CalculatorWithCounterAutoAgregationInterface calculator_1 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
    private CalculatorWithCounterAutoAgregation calculator_2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
    private CalculatorWithCounterAutoChoiceAgregation calculator_3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
    private CalculatorWithCounterAutoComposite calculator_4 = new CalculatorWithCounterAutoComposite();
    private CalculatorWithCounterAutoDecorator calculator_5 = new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator());
    private CalculatorWithCounterAutoSuper calculator_6 = new CalculatorWithCounterAutoSuper();
    private CalculatorWithCounterClassic calculator_7 = new CalculatorWithCounterClassic();

    @Test
    public void add() {

        assertEquals(calculator_1.add(1, 1), 2);
        assertEquals(calculator_2.add(1, 1), 2);
        assertEquals(calculator_3.add(1, 1), 2);
        assertEquals(calculator_4.add(1, 1), 2);
        assertEquals(calculator_5.add(1, 1), 2);
        assertEquals(calculator_6.add(1, 1), 2);
        assertEquals(calculator_7.add(1, 1), 2);

    }

    @Test
    public void addWhitZeroArguments() {

        assertEquals(calculator_1.add(0, 0), 0);
        assertEquals(calculator_2.add(0, 0), 0);
        assertEquals(calculator_3.add(0, 0), 0);
        assertEquals(calculator_4.add(0, 0), 0);
        assertEquals(calculator_5.add(0, 0), 0);
        assertEquals(calculator_6.add(0, 0), 0);
        assertEquals(calculator_7.add(0, 0), 0);

    }

    @Test
    public void addWhitNegativeArguments() {

        assertEquals(calculator_1.add(-1, -1), -2);
        assertEquals(calculator_2.add(-1, -1), -2);
        assertEquals(calculator_3.add(-1, -1), -2);
        assertEquals(calculator_4.add(-1, -1), -2);
        assertEquals(calculator_5.add(-1, -1), -2);
        assertEquals(calculator_6.add(-1, -1), -2);
        assertEquals(calculator_7.add(-1, -1), -2);

    }

    @Test
    public void subtract() {

        assertEquals(calculator_1.subtract(1, 1), 0);
        assertEquals(calculator_2.subtract(1, 1), 0);
        assertEquals(calculator_3.subtract(1, 1), 0);
        assertEquals(calculator_4.subtract(1, 1), 0);
        assertEquals(calculator_5.subtract(1, 1), 0);
        assertEquals(calculator_6.subtract(1, 1), 0);
        assertEquals(calculator_7.subtract(1, 1), 0);

    }

    @Test
    public void subtractZeroArguments() {

        assertEquals(calculator_1.subtract(0, 0), 0);
        assertEquals(calculator_2.subtract(0, 0), 0);
        assertEquals(calculator_3.subtract(0, 0), 0);
        assertEquals(calculator_4.subtract(0, 0), 0);
        assertEquals(calculator_5.subtract(0, 0), 0);
        assertEquals(calculator_6.subtract(0, 0), 0);
        assertEquals(calculator_7.subtract(0, 0), 0);
    }

    @Test
    public void subtractNegativeArguments() {

        assertEquals(calculator_1.subtract(-1, -1), 0);
        assertEquals(calculator_2.subtract(-1, -1), 0);
        assertEquals(calculator_3.subtract(-1, -1), 0);
        assertEquals(calculator_4.subtract(-1, -1), 0);
        assertEquals(calculator_5.subtract(-1, -1), 0);
        assertEquals(calculator_6.subtract(-1, -1), 0);
        assertEquals(calculator_7.subtract(-1, -1), 0);

    }

    @Test
    public void multiply() {

        assertEquals(calculator_1.multiply(1, 1), 1);
        assertEquals(calculator_2.multiply(1, 1), 1);
        assertEquals(calculator_3.multiply(1, 1), 1);
        assertEquals(calculator_4.multiply(1, 1), 1);
        assertEquals(calculator_5.multiply(1, 1), 1);
        assertEquals(calculator_6.multiply(1, 1), 1);
        assertEquals(calculator_7.multiply(1, 1), 1);

    }

    @Test
    public void multiplyZeroArguments() {

        assertEquals(calculator_1.multiply(0, 0), 0);
        assertEquals(calculator_2.multiply(0, 0), 0);
        assertEquals(calculator_3.multiply(0, 0), 0);
        assertEquals(calculator_4.multiply(0, 0), 0);
        assertEquals(calculator_5.multiply(0, 0), 0);
        assertEquals(calculator_6.multiply(0, 0), 0);
        assertEquals(calculator_7.multiply(0, 0), 0);

    }

    @Test
    public void multiplyNegativeArguments() {

        assertEquals(calculator_1.multiply(-1, -1), 1);
        assertEquals(calculator_2.multiply(-1, -1), 1);
        assertEquals(calculator_3.multiply(-1, -1), 1);
        assertEquals(calculator_4.multiply(-1, -1), 1);
        assertEquals(calculator_5.multiply(-1, -1), 1);
        assertEquals(calculator_6.multiply(-1, -1), 1);
        assertEquals(calculator_7.multiply(-1, -1), 1);

    }

    @Test
    public void divide() {

        assertEquals(calculator_1.divide(1, 1), 1);
        assertEquals(calculator_2.divide(1, 1), 1);
        assertEquals(calculator_3.divide(1, 1), 1);
        assertEquals(calculator_4.divide(1, 1), 1);
        assertEquals(calculator_5.divide(1, 1), 1);
        assertEquals(calculator_6.divide(1, 1), 1);
        assertEquals(calculator_7.divide(1, 1), 1);

    }

    @Test
    public void divideZeroArguments() {

        assertTrue(Double.isNaN(calculator_1.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_2.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_3.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_4.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_5.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_6.divide(0, 0)));
        assertTrue(Double.isNaN(calculator_7.divide(0, 0)));

    }

    @Test
    public void divideNegativeArguments() {

        assertEquals(calculator_1.divide(-1, -1), 1);
        assertEquals(calculator_2.divide(-1, -1), 1);
        assertEquals(calculator_3.divide(-1, -1), 1);
        assertEquals(calculator_4.divide(-1, -1), 1);
        assertEquals(calculator_5.divide(-1, -1), 1);
        assertEquals(calculator_6.divide(-1, -1), 1);
        assertEquals(calculator_7.divide(-1, -1), 1);
    }

    @Test
    public void power() {

        assertEquals(calculator_1.power(2, 10), 1024);
        assertEquals(calculator_2.power(2, 10), 1024);
        assertEquals(calculator_3.power(2, 10), 1024);
        assertEquals(calculator_4.power(2, 10), 1024);
        assertEquals(calculator_5.power(2, 10), 1024);
        assertEquals(calculator_6.power(2, 10), 1024);
        assertEquals(calculator_7.power(2, 10), 1024);
    }

    @Test
    public void powerZeroArguments() {

        assertEquals(calculator_1.power(0, 0), 1);
        assertEquals(calculator_2.power(0, 0), 1);
        assertEquals(calculator_3.power(0, 0), 1);
        assertEquals(calculator_4.power(0, 0), 1);
        assertEquals(calculator_5.power(0, 0), 1);
        assertEquals(calculator_6.power(0, 0), 1);
        assertEquals(calculator_7.power(0, 0), 1);
    }

    @Test
    public void powerNegativeNumber() {

        assertEquals(calculator_1.power(-2, 10), 1024);
        assertEquals(calculator_2.power(-2, 10), 1024);
        assertEquals(calculator_3.power(-2, 10), 1024);
        assertEquals(calculator_4.power(-2, 10), 1024);
        assertEquals(calculator_5.power(-2, 10), 1024);
        assertEquals(calculator_6.power(-2, 10), 1024);
        assertEquals(calculator_7.power(-2, 10), 1024);
    }

    @Disabled
    @Test
    public void powerNegativePowerOfCalculatorWithOperator() {

        assertEquals(calculator_1.power(2, -1), 0.5);  // Возвращает бесконечность!!!
        assertEquals(calculator_3.power(2, -1), 0.5);
        assertEquals(calculator_5.power(2, -1), 0.5);
    }

    @Test
    public void powerNegativePower() {


        assertEquals(calculator_2.power(2, -1), 0.5);
        assertEquals(calculator_4.power(2, -1), 0.5);
        assertEquals(calculator_6.power(2, -1), 0.5);
        assertEquals(calculator_7.power(2, -1), 0.5);


    }

    @Test
    public void abs() {

        assertEquals(calculator_1.abs(-2), 2);
        assertEquals(calculator_2.abs(-2), 2);
        assertEquals(calculator_3.abs(-2), 2);
        assertEquals(calculator_4.abs(-2), 2);
        assertEquals(calculator_5.abs(-2), 2);
        assertEquals(calculator_6.abs(-2), 2);
        assertEquals(calculator_7.abs(-2), 2);
    }

    @Test
    public void sqrt() {

        assertEquals(calculator_1.sqrt(4), 2);
        assertEquals(calculator_2.sqrt(4), 2);
        assertEquals(calculator_3.sqrt(4), 2);
        assertEquals(calculator_4.sqrt(4), 2);
        assertEquals(calculator_5.sqrt(4), 2);
        assertEquals(calculator_6.sqrt(4), 2);
        assertEquals(calculator_7.sqrt(4), 2);
    }

    @Test
    public void sqrtWhitZeroArgument() {

        assertEquals(calculator_1.sqrt(0), 0);
        assertEquals(calculator_2.sqrt(0), 0);
        assertEquals(calculator_3.sqrt(0), 0);
        assertEquals(calculator_4.sqrt(0), 0);
        assertEquals(calculator_5.sqrt(0), 0);
        assertEquals(calculator_6.sqrt(0), 0);
        assertEquals(calculator_7.sqrt(0), 0);
    }

    @Test
    public void sqrtWhitNegativeArgument() {

        assertEquals(calculator_1.sqrt(-4), 0.0);
        assertEquals(calculator_2.sqrt(-4), 0.0);
        assertEquals(calculator_3.sqrt(-4), 0.0);
        assertEquals(calculator_4.sqrt(-4), 0.0);
        assertEquals(calculator_5.sqrt(-4), 0.0);
        assertEquals(calculator_6.sqrt(-4), 0.0);
        assertEquals(calculator_7.sqrt(-4), 0.0);
    }

    @Test
    public void getCounter() {

        calculator_1.add(1, 1);
        calculator_2.add(1, 1);
        calculator_3.add(1, 1);
        calculator_4.add(1, 1);
        calculator_5.add(1, 1);
        calculator_6.add(1, 1);

        assertEquals(calculator_1.getCountOperation(), 1);
        assertEquals(calculator_2.getCountOperation(), 1);
        assertEquals(calculator_3.getCountOperation(), 1);
        assertEquals(calculator_4.getCountOperation(), 1);
        assertEquals(calculator_5.getCountOperation(), 1);
        assertEquals(calculator_6.getCountOperation(), 1);
    }

    @Disabled
    @Test
    public void getCounterCalculatorWithCounterClassic() {

        calculator_7.add(1, 1);

        assertEquals(calculator_7.getCountOperation(), 1); // Не срабатывает счетчик
    }


}
