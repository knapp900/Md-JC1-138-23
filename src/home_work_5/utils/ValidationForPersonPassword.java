package home_work_5.utils;

public class ValidationForPersonPassword {

    private static final int MIN_LENGTH_PASSWORD = 5;
    private static final int MAX_LENGTH_PASSWORD = 10;

    public static boolean isValid(String password) {

        if (password.length() >= MIN_LENGTH_PASSWORD && password.length() <= MAX_LENGTH_PASSWORD) {
            return true;
        } else {
            return false;
        }
    }
}
