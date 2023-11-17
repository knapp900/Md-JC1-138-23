package home_work_5.utils;

public class ValidationForAnimalAge {
    private static final int MIN_LENGTH_PASSWORD = 1;
    private static final int MAX_LENGTH_PASSWORD = 15;

    public static boolean isValid(int age) {

        if (age >= MIN_LENGTH_PASSWORD && age <= MAX_LENGTH_PASSWORD) {
            return true;
        } else {
            return false;
        }
    }
}
