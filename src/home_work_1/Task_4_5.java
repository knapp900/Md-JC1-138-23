package home_work_1;
/*
	4.5 Буква или иной символ
 */
public class Task_4_5 {

    public static void main(String[] args) {

        char[] array = new char[]{'a', 'a', 'R', 'o', 'z', '$'};

        for (int i = 0; i < array.length; i++) {

            System.out.println(letterOrSymbol(array[i]));

        }
    }

    public static String letterOrSymbol(char character) {

        if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
            return "Вы ввели букву: " + character;
        }
        return "Вы ввели символ: " + character;
    }

}
