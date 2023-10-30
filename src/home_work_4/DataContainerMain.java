package home_work_4;

import home_work_4.comparators.StringAlphabeticComparator;
import home_work_4.comparators.StringLengthComparator;

import java.util.Iterator;

public class DataContainerMain {

    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>();
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела = null
        container.sort(new StringLengthComparator()); //Сортируется по длинне
        System.out.println(container); // ["Привет", "Работаю", "Как дела", "Давай потом"]
        container.sort(new StringAlphabeticComparator()); //Сортируется по алфавиту
        System.out.println(container); // ["Давай потом", "Как дела", "Привет", "Работаю"]
        DataContainer.sort(container);
        System.out.println(container);

        Iterator<String> iterator = container.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }


    }

}

