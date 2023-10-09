package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/*
4. ������� ����� CalculatorWithMathExtends.
	+4.1 ��� ������ ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+4.2 ������ ����� ������ ����������� ����� CalculatorWithOperator.
	+4.3 �������:
		4.3.1 4 ������� �������������� ������ (�������, ���������, ���������, ��������)
		�� ������ ���� ��������� �������� � ������, � ������ ���� ������������ �� ������������� ������ (4.2).
		4.3.2 3 ������ (���������� � ����� ������� �������� �������������� �����, ������ �����, ������ �� �����).
		������ ������ ������ �������������� ������ ������������� ������ (4.2) � ������ ��������� � ���� ���� �����
		���������� Math � ������� ����������� ���������� .
	+4.4 ������� ����� CalculatorWithMathExtendsMain � ������� ����� ����� ����� (main �����).
	� main ������ ��������� ������� ��������� ������������ � ��������� ������ �� ������� ���������� ���������
	��������� �� ������� 1. ������� � ������� ���������.
 */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double power(double numOne, double numTwo) {
        return Math.pow(numOne, numTwo);
    }


    @Override
    public double abs(double num) {
        return Math.abs(num);
    }


    public double sqrt(double num) {
        return Math.sqrt(num);
    }
}