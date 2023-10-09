package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/*
5. ������� ����� CalculatorWithCounterClassic.
	+5.1 ��� ������ ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+5.2 ������ ����� ������ ����������� ����� CalculatorWithMathExtends.
	+5.3 � ������ ������ ���� ����� void incrementCountOperation() ������� ������ ����������� ���������� ������� (����)
	� ������������.
	+5.4 � ������ ������ ���� ����� long getCountOperation() ������� ������ ���������� ���������� ������������� �������
	������������ (����).
	+5.5 ������� ����� CalculatorWithCounterClassicMain � ������� ����� ����� ����� (main �����).
	� main ������ ��������� ������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ���������
	�� ������� 1, ��� ������ �������������� �������� �������������� �������� ����� incrementCountOperation() ���
	���������� ��������. ������� � ������� ���������.
 */
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long counter;

    public CalculatorWithCounterClassic() {
      super();
      counter = 0;
    }


    public void incrementCountOperation() {
        this.counter++;
    }

    public long getCountOperation() {
        return counter;
    }

}
