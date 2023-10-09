package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

/*
12.8 ������� ����� CalculatorWithMemoryMain � ������� ����� ����� ����� (main �����). � main ������ ���������
	������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ��������� �� ������� 1.
	������� � ������� ���������. � ����� ����������� ������������� ���������� ��� �������� �������� ����������� �
	��������, � ����� ����������� ������ ������� ������������, ����� ������������ ������ �������� � ����� ���������
	�� ������ ����������� ��������.
 */
public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());

        calculator
                .add((calculator
                        .add(calculator
                                .multiply(15, 7),calculator
                                .power(
                                        (calculator
                                                .divide(28, 5)), 2))) , 4.1);
        calculator.save();

        System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 = %.4f", calculator.load());

    }
}
