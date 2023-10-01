package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

/*
2.1.2.1. Пример в отдельном классе с main. int[] container = arrayRandom(5, 100).
Результат: В методе arrayRandom будет создан массив размером 5 с числами
от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */
public class Task_2_1_2_1 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandom(5, 100);
        System.out.println(Arrays.toString(container));
    }

}
