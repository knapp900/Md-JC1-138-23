package home_work_2.arrays.task_2_3.impl;

import home_work_2.arrays.task_2_3.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    public void printAllElements(int[] array) {

        for (int element : array) {

            System.out.print(element + " ");
        }
    }

    public void printEverySecondElement(int[] array) {

        int i = 0;

        for (int element : array) {

            if (i % 2 != 0) {


                System.out.print(element + " ");
            }
            i++;
        }
    }

    public void printElementsInReverseOrder(int[] array) {

        int i = array.length - 1;

        for (int a : array) {

            System.out.print(array[i] + " ");

            i--;
        }
    }
}
