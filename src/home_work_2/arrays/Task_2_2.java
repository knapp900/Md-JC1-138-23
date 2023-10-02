package home_work_2.arrays;

import home_work_2.arrays.task_2_3.IArraysOperation;
import home_work_2.arrays.task_2_3.impl.DoWhileOperation;
import home_work_2.arrays.task_2_3.impl.ForEachOperation;
import home_work_2.arrays.task_2_3.impl.ForOperation;
import home_work_2.arrays.task_2_3.impl.WhileOperation;
import home_work_2.utils.ArraysUtils;

public class Task_2_2 {
    public static void main(String[] args) {

        ArrayIteration.printAllElements(ArraysUtils.arrayRandom(10,100));
        System.out.println();
        ArrayIteration.printEverySecondElement(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        ArrayIteration.printElementsInReverseOrder(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
