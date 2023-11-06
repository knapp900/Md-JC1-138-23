package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_1_Test {

    @Test
    @DisplayName("Результат оператора & : 12 | 13 = 1100")
    public void bitwiseOperationsAndTest() {
        Assertions.assertEquals(Task_1.bitwiseOperatorAnd(12,13),"1100");
    }

    @Test
    @DisplayName("Результат оператора | : 12 | 13 = 1101")
    public void bitwiseOperationsOrTest() {
        Assertions.assertEquals(Task_1.bitwiseOperatorOr(12,13),"1101");
    }
}
