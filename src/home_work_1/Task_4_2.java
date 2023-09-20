package home_work_1;
/*
	4.2 Среди трёх чисел найти среднее
 */
public class Task_4_2 {

    public static int middleOfThreeDigit(int numberOne, int numberTwo, int numberThree) {

        if (numberOne < numberTwo && numberOne > numberThree || numberOne > numberTwo && numberOne < numberThree) {
            return numberOne;

        } else if (numberTwo < numberOne && numberTwo > numberThree || numberTwo > numberOne && numberTwo < numberThree) {
            return numberTwo;
        }
        return numberThree;
    }
}
