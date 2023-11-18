package home_work_5;

import java.util.Collection;

public interface Operations {
    /**
     * ��������� �������� ���������, ����������, ���������� � ������ ������� �������� ��� ���������� �� ������� 6.
     *
     * @param t          - Person or Animal ��� ������������� ������������ ���������.
     * @param collection - ��������� <T>.
     * @param count      - ���������� �������� ��� ���������� ���������.
     * @param <T>
     */
    <T> void doOperations(T t, Collection collection, int count);
}
