package home_work_2.loops;

import home_work_2.loops.Task_1_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1_4_Test {

    Task_1_4 task = new Task_1_4();

    @Test
    public void isNotOverflow_1() {

        assertFalse(task.isOverflow(Long.MAX_VALUE - 1,true));
    }

    @Test
    public void isNotOverflow_2() {

        assertFalse(task.isOverflow(Long.MAX_VALUE + 1,false));
    }

    @Test
    public void isNotOverflowWhitZeroArgument() {

        assertFalse(task.isOverflow(0, true));
    }
}
