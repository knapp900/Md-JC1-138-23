package home_work_1;

/*
3. Изучить библиотеку (класс) Math из jdk. (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html).
   Отразить эксперименты в сданной домашней работе. Материалов в интернете очень много
 */
public class Task_3 {

    public static void main(String[] args) {
        int one = 10;
        int two = 11;
        double three = 11.6;
        double result;

        // Min
        result = Math.min(one,two);
        System.out.println("Минимальное значение между " + one + " и " + two + " = " + result);

        // Max
        result = Math.max(one,two);
        System.out.println("Максимальное значение между " + one + " и " + two + " = " + result);

        // Round
        result = Math.round(three);
        System.out.println("Округление числа " + three + " = " + result);

        // Random
        result = Math.random() * 10;
        System.out.println("Выводит случайное число в диапозоне от 1 до 10 за счет умножения на 10: " + result);

        // Pow
        result = Math.pow(2,10);
        System.out.println("Выводит степень первый аргумент в значение второго 2^10 = " + result);

    }

}
