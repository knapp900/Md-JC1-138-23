package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/*
3. ������� ����� CalculatorWithMathCopy.
	+3.1 ��� ������ ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+3.2 � ������ ������ �������������� �������������� ������:
		3.2.1 4 ������� �������������� ������ (�������, ���������, ���������, ��������).
		����������� ������� �������������� �������� �� CalculatorWithOperator.
		3.2.2 3 ������ (���������� � ����� ������� �������� �������������� �����, ������ �����, ������ �� �����).
		������ ������ ������ ��������� � ���� ���� ����� ���������� Math � ������� ����������� ����������.
	+3.3 ������� ����� CalculatorWithMathCopyMain � ������� ����� ����� ����� (main �����).
	� main ������ ��������� ������� ��������� ������������ � ��������� ������ �� ������� ����������
	��������� ��������� �� ������� 1. ������� � ������� ���������.
 */
public class CalculatorWithMathCopy implements ICalculator {
    public double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    public double subtract(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    public double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    public double divide(double numOne, int numTwo) {
        return numOne / numTwo;
    }

    public double power(double numOne, double numTwo) {

        return Math.pow(numOne, numTwo);
    }

    public double abs(double num) {

        return Math.abs(num);
    }

    public double sqrt(double num) {

        return Math.sqrt(num);
    }
}
