package home_work_2.arrays;

import home_work_2.arrays.task_2_3.IArraysOperation;
import home_work_2.arrays.task_2_3.impl.DoWhileOperation;
import home_work_2.arrays.task_2_3.impl.ForEachOperation;
import home_work_2.arrays.task_2_3.impl.ForOperation;
import home_work_2.arrays.task_2_3.impl.WhileOperation;
import home_work_2.utils.ArraysUtils;

public class Task_2_2 {
    public static void main(String[] args) {
        IArraysOperation doWhileOps = new DoWhileOperation();
        IArraysOperation whileOps = new WhileOperation();
        IArraysOperation forEachOps = new ForEachOperation();
        IArraysOperation forOps = new ForOperation();


        doWhileOps.printAllElements(ArraysUtils.arrayRandom(10,100));
        System.out.println();
        doWhileOps.printEverySecondElement(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        doWhileOps.printElementsInReverseOrder(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        whileOps.printAllElements(ArraysUtils.arrayRandom(10,10));
        System.out.println();
        whileOps.printEverySecondElement(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        whileOps.printElementsInReverseOrder(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        forEachOps.printAllElements(ArraysUtils.arrayRandom(10,100));
        System.out.println();
        forEachOps.printEverySecondElement(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        forEachOps.printElementsInReverseOrder(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        forOps.printAllElements(ArraysUtils.arrayRandom(10,100));
        System.out.println();
        forOps.printEverySecondElement(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        forOps.printElementsInReverseOrder(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        ArrayIteration.printAllElements(ArraysUtils.arrayRandom(10,100));
        System.out.println();
        ArrayIteration.printEverySecondElement(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println();
        ArrayIteration.printElementsInReverseOrder(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
