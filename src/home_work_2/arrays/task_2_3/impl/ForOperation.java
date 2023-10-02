package home_work_2.arrays.task_2_3.impl;

import home_work_2.arrays.task_2_3.IArraysOperation;

public class ForOperation implements IArraysOperation {
    @Override
    public void printAllElements(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    @Override
    public void printEverySecondElement(int[] array) {

        for (int i = 0; i < array.length; i ++) {

            System.out.print(array[++i] + " ");
        }
    }

    @Override
    public void printElementsInReverseOrder(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");
        }
    }
}
