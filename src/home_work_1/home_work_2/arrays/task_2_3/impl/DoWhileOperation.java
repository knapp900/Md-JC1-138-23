package home_work_2.arrays.task_2_3.impl;

import home_work_2.arrays.task_2_3.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public void printAllElements(int[] array) {

        int i = 0;

        do {

            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
    }

    @Override
    public void printEverySecondElement(int[] array) {

        int i = 0;

        do {
            if (i % 2 != 0) {

                System.out.print(array[i] + " ");
            }
            i++;
        } while (i < array.length);
    }

    @Override
    public void printElementsInReverseOrder(int[] array) {

        int i = array.length - 1;

        do {

            System.out.print(array[i] + " ");
            i--;

        } while (i >= 0);
    }
}
