package home_work_1;

import java.util.Scanner;

/*
6.2 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else if
 */
public class Task_6_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(greetings(scanner));
        scanner.close();
    }

    private static String greetings(Scanner scanner) {
        String message = scanner.next();

        if (message != null && message.equals("Вася")) {
            return "Привет!" + '\n' + "Я тебя так долго ждал";
        } else if (message != null && message.equals("Анастасия")) {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а вы кто?";
    }
}
