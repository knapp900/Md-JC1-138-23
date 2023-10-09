package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

/*
9. ������� ����� CalculatorWithCounterAutoChoiceAgregation.
	+9.1 ��� ������ ����������� � ������ ������� �� ����������� (�� ����� ����������� static).
	+9.2 � ������ ������ ������ ���� ��������� �������� ������������:
		9.2.1 ����������� ������ ���� CalculatorWithOperator
		9.2.2 ����������� ������ ���� CalculatorWithMathCopy
		9.2.3 ����������� ������ ���� CalculatorWithMathExtends
	+9.4 ������ ����� ����� �� ����� �������� ������� ����������, ��� ����� ������������ ������ ���������� ������������
	������� �������� � �����������.
	+9.5 � ������� ������ �������������� �������������� ������:
		9.5.1 4 ������� �������������� ������ (�������, ���������, ���������, ��������).
		9.5.2 3 ������ (���������� � ����� ������� �������� �������������� �����, ������ �����, ������ �� �����).
	+9.6 � ������ ������ ���� ����� long getCountOperation() ������� ������ ���������� ���������� ������������� �������
	������������. ��� ������ ������� ������ ������� ����� �� �������������.
	+9.7 ������� ����� CalculatorWithCounterDelegateChoiceAgregationMain � ������� ����� ����� ����� (main �����).
	� main ������ ���������:
		9.7.1 ������� ��������� ������������ ��������� ����������� ����������� CalculatorWithOperator � ��������� ������
		�� ������� ���������� ��������� ��������� �� ������� 1. ������� � ������� ���������� ����������� ��������� �
		��������� ������ getCountOperation().
		9.7.2 ������� ��������� ������������ ��������� ����������� ����������� CalculatorWithMathCopy � ��������� ������
		�� ������� ���������� ��������� ��������� �� ������� 1. ������� � ������� ���������� ����������� ��������� �
		��������� ������ getCountOperation().
		9.7.3 ������� ��������� ������������ ��������� ����������� ����������� CalculatorWithMathExtends � ���������
		������ �� ������� ���������� ��������� ��������� �� ������� 1. ������� � ������� ���������� �����������
		��������� � ��������� ������ getCountOperation().

 */
public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    private long counter;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
        counter = 0;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
        counter = 0;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
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

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.power(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.power(numOne, numTwo);
        }
        return calculatorWithOperator.power(numOne, numTwo);
    }

    /**
     * ���������� ������ ���������
     *
     * @param num - ��������
     * @return - ���������
     */
    public double abs(double num) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(num);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.abs(num);
        }
        return calculatorWithOperator.abs(num);
    }

    /**
     * ���������� ���������� ������
     *
     * @param num - ��������
     * @return - ���������
     */
    public double sqrt(double num) {

        incrementCountOperation();

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(num);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sqrt(num);
        }
        return calculatorWithOperator.sqrt(num);
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

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.add(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.add(numOne, numTwo);
        }
        return calculatorWithOperator.add(numOne, numTwo);
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

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtract(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.subtract(numOne, numTwo);
        }
        return calculatorWithOperator.subtract(numOne, numTwo);
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

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.multiply(numOne, numTwo);
        }
        return calculatorWithOperator.multiply(numOne, numTwo);
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

        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(numOne, numTwo);

        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.divide(numOne, numTwo);
        }
        return calculatorWithOperator.divide(numOne, numTwo);
    }

}
