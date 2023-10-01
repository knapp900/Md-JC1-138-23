package home_work_2.arrays.task_2_3.impl;

import home_work_2.arrays.task_2_3.IArraysOperation;

public class WhileOperation implements IArraysOperation {
    @Override
    public void printAllElements(int[] array) {

        int i = 0;

        while (i < array.length) {

            System.out.print(array[i] + " ");
            i++;
        }
    }

    @Override
    public void printEverySecondElement(int[] array) {

        int i = 0;

        while (i < array.length) {

            if (i % 2 != 0) {

                System.out.print(array[i] + " ");
            }
            i++;
        }
    }

    @Override
    public void printElementsInReverseOrder(int[] array) {

        int i = array.length - 1;

        while (i >= 0) {

            System.out.print(array[i] + " ");
            i--;
        }
    }
}
