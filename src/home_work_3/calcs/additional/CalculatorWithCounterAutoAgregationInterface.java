package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/*
11. ������� ����� CalculatorWithCounterAutoAgregationInterface.
	+11.1 ������ ������ ������ ��������� ������� (������������ new), ����� ������������ ������ ��� ��� ������� ���
	������������ ������ ������.
	+11.2 ��� ������ ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+11.3 � ������ ������ ������ ���� ������ ����������� ����������� ������ ���� ICalculator
	+11.4 ������ ����� �������� �� ����� ������� ����������, �� ����� ������������ ������ ���������� ������������
	������� �������� � �����������
	+11.5 � ������ ������ �������������� ��� ������ ����������� � ����������.
	+11.6 � ������ ������ ���� ����� long getCountOperation() ������� ������ ���������� ���������� �������������
	������� ������������. ��� ������ ������� ������ ������� ����� �� �������������.
	+11.7 ������� ����� CalculatorWithCounterAutoCompositeInterfaceMain � ������� ����� ����� ����� (main �����).
	� main ������ ��������� ������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ���������
	�� ������� 1. ������� � ������� ���������� ����������� ��������� � ��������� ������ getCountOperation().

 */
public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calculator;
    private long counter;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
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
        return calculator.power(numOne, numTwo);
    }

    /**
     * ���������� ������ ���������
     *
     * @param num - ��������
     * @return - ���������
     */
    public double abs(double num) {
        incrementCountOperation();
        return calculator.abs(num);
    }

    /**
     * ���������� ���������� ������
     *
     * @param num - ��������
     * @return - ���������
     */
    public double sqrt(double num) {
        incrementCountOperation();
        return calculator.sqrt(num);
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
        return calculator.add(numOne, numTwo);
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
        return calculator.subtract(numOne, numTwo);
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
        return calculator.multiply(numOne, numTwo);
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
        return calculator.divide(numOne, numTwo);
    }

}
