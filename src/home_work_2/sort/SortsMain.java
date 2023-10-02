package home_work_2.sort;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

/*
4.2. Создать класс SortsMain. Все проверки пишутся в main.
	4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата
	"[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
	Для преобразования массива в текст можно использовать класс Arrays.
	4.2.2. Для тестов используем предварительно созданные массивы:
		4.2.2.1. new int[]{1,2,3,4,5,6}
		4.2.2.2. new int[]{1,1,1,1}
		4.2.2.3. new int[]{9,1,5,99,9,9}
		4.2.2.4. new int[]{}
		4.2.2.5. new int[]{6,5,4,3,2,1}
	4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива.
	Вызывая ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
	4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль.
	Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.
 */
public class SortsMain {


    public static void main(String[] args) {

        int[] randomArray;
        int[] consolArray;

//          Booble Sort
//        4.2.2.1. new int[]{1,2,3,4,5,6}
        System.out.print(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}) + " -> ");
        SortsUtils.sort(new int[]{1, 2, 3, 4, 5, 6});

        System.out.println();
//        4.2.2.2. new int[]{1,1,1,1}
        System.out.print(Arrays.toString(new int[]{1, 1, 1, 1}) + " -> ");
        SortsUtils.sort(new int[]{1, 1, 1, 1});

        System.out.println();
//        4.2.2.3. new int[]{9,1,5,99,9,9}
        System.out.print(Arrays.toString(new int[]{9, 1, 5, 99, 9, 9}) + " -> ");
        SortsUtils.sort(new int[]{9, 1, 5, 99, 9, 9});

        System.out.println();
//        4.2.2.4. new int[]{}
        System.out.print(Arrays.toString(new int[]{}) + " -> ");
        SortsUtils.sort(new int[]{});

        System.out.println();
//        4.2.2.5. new int[]{6,5,4,3,2,1}
        System.out.print(Arrays.toString(new int[]{6, 5, 4, 3, 2, 1}) + " -> ");
        SortsUtils.sort(new int[]{6, 5, 4, 3, 2, 1});

        System.out.println();

//        Шейкерная сортировка
//        4.2.2.1. new int[]{1,2,3,4,5,6}
        System.out.print(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6}) + " -> ");
        SortsUtils.shake(new int[]{1, 2, 3, 4, 5, 6});

        System.out.println();
//        4.2.2.2. new int[]{1,1,1,1}
        System.out.print(Arrays.toString(new int[]{1, 1, 1, 1}) + " -> ");
        SortsUtils.shake(new int[]{1, 1, 1, 1});


        System.out.println();
//        4.2.2.3. new int[]{9,1,5,99,9,9}
        System.out.print(Arrays.toString(new int[]{9, 1, 5, 99, 9, 9}) + " -> ");
        SortsUtils.shake(new int[]{9, 1, 5, 99, 9, 9});

        System.out.println();
//        4.2.2.4. new int[]{}
        System.out.print(Arrays.toString(new int[]{}) + " -> ");
        SortsUtils.shake(new int[]{});

        System.out.println();
//        4.2.2.5. new int[]{6,5,4,3,2,1}
        System.out.print(Arrays.toString(new int[]{6, 5, 4, 3, 2, 1}) + " -> ");
        SortsUtils.shake(new int[]{6, 5, 4, 3, 2, 1});

        System.out.println();

//          Booble Sort
        randomArray = ArraysUtils.arrayRandom(10, 100);

        System.out.print(Arrays.toString(randomArray) + " -> ");
        SortsUtils.sort(randomArray);

//        Шейкерная сортировка
        randomArray = null;
        randomArray = ArraysUtils.arrayRandom(10, 100);
        System.out.println();

        System.out.print(Arrays.toString(randomArray) + " -> ");
        SortsUtils.shake(randomArray);

        System.out.println();
        consolArray = ArraysUtils.arrayFromConsole();

//          Booble Sort
        System.out.print(Arrays.toString(consolArray) + " -> ");
        SortsUtils.sort(consolArray);

        consolArray = null;
        System.out.println();
        consolArray = ArraysUtils.arrayFromConsole();

//        Шейкерная сортировка
        System.out.print(Arrays.toString(consolArray) + " -> ");
        SortsUtils.shake(consolArray);

    }
}


