package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/*
6. ������� ����� CalculatorWithCounterAutoSuper.
	+6.1 ��� ������ � ���� ����������� � ������ ������ �� ����������� (�� ����� ����������� static).
	+6.2 ������ ����� ��������� ����� CalculatorWithMathExtends.
	6.3 ������ ����� �������������� ��� ������ ���������� � ���������� ������������ � � ���� ������� ������ ����
	���������� �������� ����� �� ������������� (���� ����� ��� ���� ������� ������), � ������ ���������� ����������
	��� ������ ��������� ����� super �������� ������ ����� � ��������. �������� ������� ����� plus(7, 3) ������� ������
	������� ��� ����� � ������� ��������� ��������. ������ ������ plus() ����� ���������� �����, � ����� ������ �����
	super.plus(7, 3). ������������� super �������� ������� ���������� �� ������������� ������.
	+6.4 � ������ ������ ���� ����� long getCountOperation() ������� ������ ���������� ���������� ������������� �������
	������������. ��� ������ ������� ������ ������� ����� �� �������������.
	+6.5 ������� ����� CalculatorWithCounterAutoSuperMain � ������� ����� ����� ����� (main �����). � main ������
	��������� ������� ��������� ������������ � ��������� ������ �� ������� ���������� ��������� ��������� �� ������� 1.
	������� � ������� ���������� ����������� ��������� � ��������� ������ getCountOperation().
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counter;


    public CalculatorWithCounterAutoSuper() {
        super();
        counter = 0;

    }

    @Override
    public double power(double numOne, double numTwo) {
        incrementCountOperation();
        return super.power(numOne, numTwo);
    }

    @Override
    public double abs(double num) {
        incrementCountOperation();
        return super.abs(num);
    }

    @Override
    public double sqrt(double num) {
        incrementCountOperation();
        return super.sqrt(num);
    }

    @Override
    public double add(double numOne, double numTwo) {
        incrementCountOperation();
        return super.add(numOne, numTwo);
    }

    @Override
    public double subtract(double numOne, double numTwo) {
        incrementCountOperation();
        return super.subtract(numOne, numTwo);
    }

    @Override
    public double multiply(double numOne, double numTwo) {
        incrementCountOperation();
        return super.multiply(numOne, numTwo);
    }

    @Override
    public double divide(double numOne, int numTwo) {
        incrementCountOperation();
        return super.divide(numOne, numTwo);
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
}
