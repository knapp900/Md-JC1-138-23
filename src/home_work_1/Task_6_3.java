package home_work_1;

import java.util.Scanner;

/*
6.3 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи switch
 */
public class Task_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        if (message != null) {
            System.out.println(greetings(message));
        }
        scanner.close();
    }

    private static String greetings(String message) {

        return switch (message) {
            case "Вася" -> "Привет!" + '\n' + "Я тебя так долго ждал";
            case "Анастасия" -> "Я тебя так долго ждал";
            default -> "Добрый день, а вы кто?";
        };

    }
}
