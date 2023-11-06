package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_4_1_Test {

    @Test
    @DisplayName("4.1 Определить нечётное число 0 = false")
    public void isEvenNumber_1() {

        Task_4_1 task41 = new Task_4_1();
        assertFalse(task41.isNotEvenNumber(0));

    }

    @Test
    @DisplayName("4.1 Определить нечётное число 2 = false")
    public void isEvenNumber_2() {

        Task_4_1 task41 = new Task_4_1();

        assertFalse(task41.isNotEvenNumber(2));


    }

    @Test
    @DisplayName("4.1 Определить нечётное число -2 = false")
    public void isEvenNumber_3() {

        Task_4_1 task41 = new Task_4_1();

        assertFalse(task41.isNotEvenNumber(-2));


    }


    @Test
    @DisplayName("4.1 Определить нечётное число 3 = true")
    public void isEvenNumber_6() {

        Task_4_1 task41 = new Task_4_1();
        assertTrue(task41.isNotEvenNumber(3));

    }

    @Test
    @DisplayName("4.1 Определить нечётное число -3 = true")
    public void isEvenNumber_7() {

        Task_4_1 task41 = new Task_4_1();
        assertTrue(task41.isNotEvenNumber(-3));

    }
}
