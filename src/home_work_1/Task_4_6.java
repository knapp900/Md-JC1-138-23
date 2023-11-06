package home_work_1;

/*
	4.6 Определить високосный год или нет

 */
public class Task_4_6 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1988));
    }

    public static boolean isLeapYear(int year) {

        if (year > 0) {

            return year % 4 == 0;
        }
        return false;
    }

}
