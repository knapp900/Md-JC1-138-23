package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task_4_2_Test {

    @Test
    @DisplayName("4.2 Среди трёх чисел найти среднее: 12,88,1 = 12")
    public void middleOfThreeDigit_1() {

        Assertions.assertEquals(Task_4_2.middleOfThreeDigit(12, 88, 1), 12);
    }

    @Test
    @DisplayName("4.2 Среди трёх чисел найти среднее: 12,-88,1 = 1")
    public void middleOfThreeDigit_2() {

        Assertions.assertEquals(Task_4_2.middleOfThreeDigit(12, -88, 1), 1);
    }

    @Test
    @DisplayName("4.2 Среди трёх чисел найти среднее: 0,0,0 = 0")
    public void middleOfThreeDigit_3() {

        Assertions.assertEquals(Task_4_2.middleOfThreeDigit(0, 0, 0), 0);
    }

    @Test
    @DisplayName("4.2 Среди трёх чисел найти среднее: -1,-2,3 = -1")
    public void middleOfThreeDigit_4() {

        Assertions.assertEquals(Task_4_2.middleOfThreeDigit(-1, -2, 3), -1);
    }
}
