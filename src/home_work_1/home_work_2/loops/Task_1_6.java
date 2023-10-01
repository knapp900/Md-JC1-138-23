package home_work_2.loops;

public class Task_1_6 {

    int firstNumber = 2;
    int secondNumber = 1;

    int loop = 1;

    public String[] arr = new String[80];

    public static void main(String[] args) {
        Task_1_6 app = new Task_1_6();

        app.printTwoDimArray(app.buildMultiplyMatrix(app.getFormatStringOfMultiplyTwoNumbers(2, 10)));

    }

    private void printTwoDimArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


    private String[][] buildMultiplyMatrix(String[] multiplyArray) {

        String[][] multiplyTable = new String[21][4];
        int counter;

        for (int i = 0; i < multiplyTable.length; i++) {
            counter = i;
            for (int j = 0; j < multiplyTable[i].length; j++) {

                if (i == 0) {

                    multiplyTable[i][j] = multiplyArray[counter++];
                    counter += 9;

                } else if (i < 10) {

                    multiplyTable[i][j] = multiplyArray[counter++];
                    counter += 9;

                } else if (i == 10) {

                    multiplyTable[i][j] = "";

                } else if (i >= 11) {

                    multiplyTable[i][j] = multiplyArray[counter + 29];
                    counter += 10;
                }
            }
        }


        return multiplyTable;
    }

    private String[] getFormatStringOfMultiplyTwoNumbers(int minValue, int maxValue) { // minV = 2 maxV = 10

        String[] arr = new String[(maxValue - minValue) * maxValue];
        int counter = 0;

        for (int i = minValue; i < maxValue; i++) {
            for (int j = 1; j <= maxValue; j++) {
                arr[counter++] = i + " * " + j + " = " + i * j + '\t' + '\t';
            }
        }

        return arr;
    }


}
