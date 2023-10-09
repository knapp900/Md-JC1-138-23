package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

/*
7. ������� ����� CalculatorWithCounterAutoComposite.
	+7.1 ��� ������ � ���� ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+7.2 ������ ������ �� ������ ��������� ���� �������� ������ ������ �����������. ��� ������� ����� ������������ �����
	��� ������������. � ������ ��� ������� CalculatorWithMathCopy
	+7.3 ���������������� ������ ���� ��������� (������������ new) ������ ������� ������ �������� ������������.
	+7.4 ������ ����� �������� �� ����� ������� ����������, �� ����� ������������ ������ ���������� ������������ �������
	������� � ��� ����.
	+7.5 � ������� ������ �������������� �������������� ������:
		7.5.1 4 ������� �������������� ������ (�������, ���������, ���������, ��������).
		7.5.2 3 ������ (���������� � ����� ������� �������� �������������� �����, ������ �����, ������ �� �����).
	+7.6 � ������ ������ ���� ����� long getCountOperation() ������� ������ ���������� ���������� ������������� �������
	������������. ��� ������ ������� ������ ������� ����� �� �������������.
	+7.7 ������� ����� CalculatorWithCounterDelegateCompositeMain � ������� ����� ����� ����� (main �����).
	� main ������ ��������� ������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ���������
	�� ������� 1. ������� � ������� ���������� ����������� ��������� � ��������� ������ getCountOperation().
 */
public class CalculatorWithCounterAutoComposite {

    private CalculatorWithMathCopy calculatorWithMathCopy;
    private long counter;

    public CalculatorWithCounterAutoComposite() {
        this.calculatorWithMathCopy = new CalculatorWithMathCopy();
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
