package home_work_1;
/*
	4.4 Перевести байты в килобайты или наоборот
 */
public class Task_4_4 {

    public static void main(String[] args) {

        System.out.println(convertor(10000, 'b'));
    }

    public static String convertor(double number, char type) {

        if (type == 'b') {
            return number + " байт ровняется " + byteToKilobyte(number) + " килобайт";
        }

        return number + " килобайт ровняется " + kilobyteToByte(number) + " байт";
    }

    public static double byteToKilobyte(double number) {

        return number / 1024;
    }

    public static double kilobyteToByte(double number) {

        return number * 1024;
    }
}
