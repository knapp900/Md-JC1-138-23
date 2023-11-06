package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorStringExpressionTest {

    private CalculatorStringExpression calculator = new CalculatorStringExpression(new CalculatorWithOperator());

    @Test
    public void calculatorWhitStringOfNumbers() {

        Assertions.assertEquals(calculator.calculate("2+2*2"), 6);
    }

    @Test
    public void calculatorWhitStringOfChars() {

        Assertions.assertThrows(RuntimeException.class,() -> calculator.calculate("2+o*2"));
    }


}
