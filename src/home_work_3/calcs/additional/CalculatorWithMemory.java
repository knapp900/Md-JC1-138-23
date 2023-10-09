package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

/*
12*. ������� CalculatorWithMemory ��������� ����������� �������� ���������� ������ CalculatorWithCounterAutoAgregationInterface.
	+12.1 ������ ����������� ������������ ��� ���� ����� ��������� ����������� ������������ � ���������� ���
	�������������� �������� ������. � �������� �������� ��� ����������� �� �������� �����.
	+12.2 ��� ������ ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+12.3 � ������ ������ ������ ���� ������ ����������� ����������� ������ ���� ICalculator
	+12.4 ������ ����� �������� �� ����� ������� ����������, �� ����� ������������ ������ ���������� ������������ �������
	�������� � �����������
	+12.5 � ������ ������ �������������� �������������� ������:
		12.5.1 4 ������� �������������� ������ (�������, ���������, ���������, ��������).
		12.5.2 3 ������ (���������� � ����� ������� �������� �������������� �����, ������ �����, ������ �� �����).
	+12.6 ������� ������ �������� ����� ������:
		12.6.1 �������� � ������ ��������� ���������� ���������� ���������� ������. � ������� ������ �� ������ ����
		����������. ������ ����� ���������� �������������� �������������, � �� ��������������. ������ void save();
		12.6.2 �������� �� ������ ���������� ��������. ��� ��������� ������ �� ������ ������ ���������, ��� ������
		������ �������� ������ ����������������. ������ ����� ���������� �������������� �������������, � ��
		��������������. ������ double load();
	+12.7 � ���� ������������ ��� ������� ����ר�� ���������� �������������
	+12.8 ������� ����� CalculatorWithMemoryMain � ������� ����� ����� ����� (main �����). � main ������ ���������
	������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ��������� �� ������� 1.
	������� � ������� ���������. � ����� ����������� ������������� ���������� ��� �������� �������� ����������� �
	��������, � ����� ����������� ������ ������� ������������, ����� ������������ ������ �������� � ����� ���������
	�� ������ ����������� ��������.

 */
public class CalculatorWithMemory implements ICalculator {

    // ��������������� ����������� ���������� ���� �������
    private double lastOfMethodResult;
    // ����������� ��������
    private double savedValue;
    private ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
        savedValue = 0;
        lastOfMethodResult = 0;
    }

    /**
     * ��������� ��������� ���������� ���������� ������
     */
    public void save() {
        savedValue = lastOfMethodResult;
    }

    /**
     * ���������� ����������� ��������� ������������ � ���������� ��������� �� ����
     *
     * @return - ���������
     */
    public double load() {
        double result = savedValue;
        savedValue = 0;
        return result;
    }

    @Override
    public double add(double numOne, double numTwo) {

        return lastOfMethodResult = calculator.add(numOne, numTwo);
    }

    @Override
    public double subtract(double numOne, double numTwo) {
        return lastOfMethodResult = calculator.subtract(numOne, numTwo);
    }

    @Override
    public double multiply(double numOne, double numTwo) {
        return lastOfMethodResult = calculator.multiply(numOne, numTwo);
    }

    @Override
    public double divide(double numOne, int numTwo) {
        return lastOfMethodResult = calculator.divide(numOne, numTwo);
    }

    @Override
    public double power(double numOne, double numTwo) {
        return lastOfMethodResult = calculator.power(numOne, numTwo);
    }

    @Override
    public double abs(double num) {
        return lastOfMethodResult = calculator.abs(num);
    }

    @Override
    public double sqrt(double num) {
        return lastOfMethodResult = calculator.sqrt(num);
    }
}
