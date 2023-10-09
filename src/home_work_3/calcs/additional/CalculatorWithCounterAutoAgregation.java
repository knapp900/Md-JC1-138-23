package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/*
������� ����� CalculatorWithCounterAutoAgregation.
	+8.1 ��� ������ � ���� ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+8.2 ������ ������ �� ������ ��������� ���� �������� ������ ������ �����������. ��� ������� ����� ������������ �����
	��� ������������. � ������ ��� ������� CalculatorWithMathCopy
	+8.3 ��� ������������� ������� ���� ��������� ������������ ����������� � ������� ����� ���������� CalculatorWithMathCopy.
	+8.4 ������ ����� �������� �� ����� ������� ����������, �� ����� ������������ ������ ���������� ������������ �������
	������� � ��� ����.
	+8.5 � ������� ������ �������������� �������������� ������:
		8.5.1 4 ������� �������������� ������ (�������, ���������, ���������, ��������).
		8.5.2 3 ������ (���������� � ����� ������� �������� �������������� �����, ������ �����, ������ �� �����).
	+8.6 � ������ ������ ���� ����� long getCountOperation() ������� ������ ���������� ���������� ������������� �������
	������������. ��� ������ ������� ������ ������� ����� �� �������������.
	+8.7 ������� ����� CalculatorWithCounterDelegateAgregationMain � ������� ����� ����� ����� (main �����).
	� main ������ ��������� ������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ���������
	�� ������� 1. ������� � ������� ���������� ����������� ��������� � ��������� ������ getCountOperation().
 */
public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private long counter;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
        counter = 0;
    }

    /**
     * ����������� �������� �������� �� 1
     */
    private void incrementCountOperation() {
        this.counter++;
    }

    /**
     * ������� ����������� ������������ �������
     *
     * @return - ���������
     */
    public long getCountOperation() {
        return counter;
    }

    /**
     * ���������� � ����� ������� �������� �������������� �����
     *
     * @param numOne - ������ �������� ������� ����� ����������� � �������
     * @param numTwo - ������ ��������, ������� ������� ��������
     * @return - ���������
     */
    public double power(double numOne, double numTwo) {
        incrementCountOperation();
        return calculatorWithMathCopy.power(numOne, numTwo);
    }

    /**
     * ���������� ������ ���������
     *
     * @param num - ��������
     * @return - ���������
     */
    public double abs(double num) {
        incrementCountOperation();
        return calculatorWithMathCopy.abs(num);
    }

    /**
     * ���������� ���������� ������
     *
     * @param num - ��������
     * @return - ���������
     */
    public double sqrt(double num) {
        incrementCountOperation();
        return calculatorWithMathCopy.sqrt(num);
    }

    /**
     * ���������� ����� ����������
     *
     * @param numOne - ������ ��������
     * @param numTwo - ������ ��������
     * @return - ���������
     */
    public double add(double numOne, double numTwo) {
        incrementCountOperation();
        return calculatorWithMathCopy.add(numOne, numTwo);
    }

    /**
     * ���������� ������� ����������
     *
     * @param numOne - ������ ��������
     * @param numTwo - ������ ��������, ������� ����� ������� �� �������
     * @return - ���������
     */
    public double subtract(double numOne, double numTwo) {
        incrementCountOperation();
        return calculatorWithMathCopy.subtract(numOne, numTwo);
    }

    /**
     * ���������� ������������ ����������
     *
     * @param numOne - ������ ��������
     * @param numTwo - ������ ��������
     * @return - ���������
     */
    public double multiply(double numOne, double numTwo) {
        incrementCountOperation();
        return calculatorWithMathCopy.multiply(numOne, numTwo);
    }

    /**
     * ����� ������ �������� �� ������
     *
     * @param numOne - ������ ��������
     * @param numTwo - ������ ��������, �� ������� ����� �������� ������
     * @return - ���������
     */
    public double divide(double numOne, int numTwo) {
        incrementCountOperation();
        return calculatorWithMathCopy.divide(numOne, numTwo);
    }


}
