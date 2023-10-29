package home_work_4;

import java.util.*;
import java.util.function.Consumer;

/*
�������:
+1. ������� ����� DataContainer � �������� ���� ���� �������� (���������). �������� ������� T.
������ ����� ��� ��� � ����� ������ ������ ������������ ����� ����:
������� �������������� ���������� ������������ �������� ����������� ����.
+2. ������ DataContainer ������ ���� ���� T[] data,
���������� ������, ������� ������������� ��� �������� ������������ ��������.
��, ������ T[] � �� Object[]. ���� ������������ Object[] �� ��� ����� ������ � ��������� ������� ������ ������������
�����. ���� ����������� �� static � private
+3. ��-�� ������������ ���������� � ������ ������ ����������� ����� �������������� ���� ����������� DataContainer(T[]).
���� � ������ �������, �� � ������ �������� ��� ����� �������� � � ���� �� ����������� ����� ������� ������.
+4. � ������ ������ ������ ���� ����� int add(T item) ������� ��������� ������ �� ���������� ���� data � ����������
����� ������� � ������� ���� ��������� ������, ������� � 0.
+	4.1 ���� ���� data �� ����������� �� ������ ����� ��������� � ������ ������� (������) ����� ��������� �����������
	������� (������).
		4.1.1 ������: data = [1, 2, 3, null, null, null]. ������� add(777). ������ ���������� data =
		[1, 2, 3, 777, null, null]. ����� add ����� ����� 3.
		4.1.2 ������: data = [1, 2, 3, null, null, null]. ������� add(null). ������ ���������� data =
		[1, 2, 3, null, null, null]. ����� add ����� ����� -1.
		-1 ����� ����������� ���� ��� ������ ������� � ��� ��������� ��������� ������.
		4.1.3 ������: data = [1, null, 3, null, null, null]. ������� add(777). ������ ���������� data =
		[1, 777, 3, null, null, null]. ����� add ����� ����� 1.
+	4.2 � ������ ���� ���� data �����������, ����� ��������� �������� ������� ����� ��������� ������������ ��� �����
	���������. ��� ��� ������� Arrays.copyOf.
		4.2.1 ������: data = [1, 2, 3]. ������� add(777). ������ ���������� data = [1, 2, 3, 777]. ����� add ����� ����� 3.
		4.2.2 ������: data = []. ������� add(777). ������ ���������� data = [777]. ����� add ����� ����� 0.
+5. � ������ ������ ������ ���� ����� T get(int index). ������ ����� �������� �� DataContainer'�, �� ���� data,
�������������� ���������� ������ ������� �� �������� �� ���������� ���� ����� ����� add.
	5.1 ������: data = []. ������� add(9999). �������� data = [9999]. ����� add ������ ����� 0. �������� get(0).
	����� get ���������� 9999
	5.2 ������: data = [9999]. �������� get(1). ����� get ���������� null
+6. � ������ ������ ������ ���� ����� T[] getItems(). ������ ����� ���������� ������ �� ���� data.
+7. �������� ����� boolean delete(int index) ������� ����� ������� ������� �� ������ ���� data �� �������.
	7.1 ����� ���������� true ���� � ��� ���������� ������� ������.
		7.1.1 ������ data = [1, 2, 3, 777]. �������� delete(3). ������ ���������� data = [1, 2, 3].
		����� delete ����� true
	7.2 ����� ���������� false ���� ��� ������ �������.
		7.2.1 ������ data = [1, 2, 3, 777]. �������� delete(9). ������ ���������� data = [1, 2, 3, 777].
		����� delete ����� false
	7.3. �������������� ������ � ����� data ���������� ������� ���������. ������ ��������� �� ������ ����.
		7.3.1 ������ data = [1, 2, 3, 777]. �������� delete(2). ������ ���������� data = [1, 2, 777].
		����� delete ����� true
+8. �������� ����� boolean delete(T item) ������� ����� ������� ������� �� ������ ���� data.
	8.1 ����� ���������� false ���� �������� null.
		8.1.1 ������ data = [1, 2, 3, 777]. �������� delete(null). ����� delete ����� false a data = [1, 2, 3, 777]
		8.1.2 ������ data = [1, 2, 3, 777, null]. �������� delete(null). ����� delete ����� false a data =
		[1, 2, 3, 777, null]
	8.2 ����� ���������� true ���� � ��� ���������� ������� ������.
		8.2.1 ������ data = [1, 2, 3, 777]. �������� delete(777). ������ ���������� data = [1, 2, 3].
		����� delete ����� true
	8.3 ����� ���������� false ���� ��� ������ ��������.
		8.3.1 ������ data = [1, 2, 3, 777]. �������� delete(111). ������ ���������� data = [1, 2, 3, 777].
		����� delete ����� false
	8.4 �������������� ������ ���������� ������� ���������. ������ ��������� �� ������ ����.
		8.4.1 ������ data = [1, 2, 3, 777, 3]. �������� delete(3). ������ ���������� data = [1, 2, 777, 3].
		����� delete ����� true
-9. �������� �� ����������� ����� void sort(Comparator<.......> comparator).
������ ����� ���������� ����������� ������ ���������� � ���� data ��������� ���������� ��������� �� �����������
������� comparator. ������� Arrays ������������ ���������. �������� Comparator ����������� ������ ���� ����������
��������� �������. ��� ������� ���� ������ � ��������� ����������� ������ ��������� ���������� ���������� Comparator.
	9.1 ������ data = [3, 1, 3, 777]. �������� sort(....) ��������� ���������� �����. ������ ���������� data = [1, 3, 3, 777]
	9.2 ������ data = ["i", "hello", "1", "��� �������"]. �������� sort(....) ��������� ���������� ����� �� ������.
	������ ���������� data = ["i", "1", "hello", "��� �������"]
+10. �������������� ����� toString() � ������ � �������� ���������� data ��� ����� � ������� �������� null.
	10.1 ������ data = [1, 2, 3, 777, 3]. �������� toString() � ���������� DataContainer. ������������ ������ [1, 2, 3, 777, 3]
	10.2 ������ data = [1, 2, 3, null]. �������� toString() � ���������� DataContainer. ������������ ������ [1, 2, 3]
	10.3 ������ data = []. �������� toString() � ���������� DataContainer. ������������ ������ []
11.* � DataContainer �������� ����������� ����� void sort(DataContainer<.............> container) � ����������
extends Comparable. ������ ����� ����� ����������� �������� � ���������� ������� DataContainer ��������� ����������
��������� ���������� � �������� ��������. ��� ����� ���� ������� �������� �����.
12.* � DataContainer �������� ����������� �����
void sort(DataContainer<.............> container, Comparator<.......> comparator) ������� ����� ��������� ������
DataContainer � ���������� ���������� Comparator. ������ ����� ����� ����������� �������� � ���������� �������
DataContainer ��������� ���������� ��������� �� ����������� ������� ���������� Comparator.
13.** ����������� � DataContainer ��������� Iterable
 */
public class DataContainer<T> implements Iterable<T> {
    /**
     * ���� � ������� �������� ����������.
     */
    private T[] data;
    /**
     * ���� � ������� ��������� ������� ���������� ������������ ��������.
     */
    private int modCounter = 0;

    public DataContainer() {
        this.data = ((T[]) new Object[10]);
    }

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * ���������� �������� � ���������.
     *
     * @param item - ������������ <T> �������.
     * @return - ������ � ���������.
     */
    public int add(T item) {

        if (modCounter >= data.length - 1 && item != null) {

            grow(data);
            data[modCounter] = item;

            return modCounter++;

        } else if (modCounter <= data.length - 1 && item != null) {

            return putElement(item);
        }
        return -1;
    }

    /**
     * �������� ������� � ������ ������ � null.
     *
     * @param element - �������.
     * @return - ������ ������ � ������� ���� �������� �������,
     * -1 ���� �� ������� ��������� �������.
     */
    private int putElement(T element) {

        int position = -1;

        for (int i = 0; i < data.length; i++) {

            if (data[i] == null) {
                data[i] = element;
                position = i;
                modCounter++;
                break;
            }
        }
        return position;
    }

    /**
     * ��������� �������� �� �������.
     *
     * @param index - ������ ��������.
     * @return - ������� <T>.
     */
    public T get(int index) {

        if (index < data.length && index >= 0) {

            return data[index];
        }
        return null;
    }

    /**
     * ��������� ���� ���������.
     *
     * @return - ������ <T> ���������.
     */
    public T[] getItems() {

        if (!this.isEmpty()) {

            return data;
        }
        return null;
    }

    /**
     * ������� ������� �� �������.
     *
     * @param index - ������ ��������.
     * @return - true ���� �������� ������ ������� � false ���� ���
     */
    public boolean delete(int index) {

        if (index < data.length && index > 0) {

            data[index] = null;
            modCounter--;

            return true;
        }
        return false;
    }

    /**
     * ������� ������� �� ����������� ��������.
     *
     * @param item - �������.
     * @return - true ���� �������� ������ ������� � false ���� ���
     * ,false ���� ������� null.
     */
    public boolean delete(T item) {

        if (item != null) {

            for (int i = 0; i < data.length; i++) {

                if (Objects.equals(item, data[i])) {

                    data[i] = null;
                    modCounter--;

                    return true;
                }
            }
        }
        return false;
    }

    /**
     * �������� ������ �� ������.
     *
     * @return - true ���� ����,false ���� ���.
     */
    public boolean isEmpty() {

        return modCounter == 0 ? true : false;
    }

    /**
     * �������� ��� �������� ����� null.
     *
     * @return - �������� �������.
     */
    public String toString() {

        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < data.length; i++) {
            T e = get(i);

            if ((e == this || !Objects.equals(e, null))) {
                sb.append(e);
            }
            if (i < data.length - 1 && !Objects.equals(e, null) && i != modCounter - 1) {
                sb.append(',').append(' ');
            }
        }
        sb.append(']');

        return sb.toString();
    }

    /**
     * ������ ���������.
     *
     * @return - ������.
     */
    public int size() {

        return modCounter;
    }

    /**
     * ����� ���������� ��� ����������� � ���������, ������������ ��������� Comparable.
     *
     * @param comparator - ��������� ��� ����������.
     */
    // ???????????????
    public void sort(Comparator<? super T> comparator) {
        trimNulls();
        for (int i = 0; i < data.length - 1; i++) {

            for (int j = i + 1; j < data.length; j++) {

                if (comparator.compare(data[i], data[j]) > 0) {
                    T temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    /**
     * ������������� ������� � ������ �� ���������� �������.
     *
     * @param index   - ������.
     * @param element - �������.
     */
    public void set(int index, T element) {

        for (int i = 0; i < data.length; i++) {

            if (i == index) {
                data[i] = element;
            }
        }
    }

    /**
     * ����� ����������� ���������� ��� ����������� � ���������, ������������ ��������� Comparable.
     *
     * @param container - ������ ���������.
     * @param <T>
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
        int size = container.size();

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (container.get(i).compareTo(container.get(j)) > 0) {

                    T temp = container.get(i);
                    container.set(i, container.get(j));
                    container.set(j, temp);
                }
            }
        }
    }

    /**
     * ����� ����������� ���������� ��� ����������� � ��������� � ������������ ������������.
     *
     * @param container  - ������ DataContainer<T>.
     * @param comparator - ������ Comparator<T>.
     * @param <T>
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        int size = container.size();

        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (comparator.compare(container.get(i), container.get(j)) > 0) {
                    T temp = container.get(i);
                    container.set(i, container.get(j));
                    container.set(j, temp);
                }
            }
        }
    }

    /**
     * ����� ��������� �� ���� data ��� null � �������������� ������ ��� null.
     */
    private void trimNulls() {
        int nullsCounter = 0;
        int counter = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                nullsCounter++;
            }
        }
        T[] newArray = (T[]) new Object[data.length - nullsCounter];

        for (int i = 0; i < data.length; i++) {

            if (data[i] != null) {
                newArray[counter] = data[i];
                counter++;
            }
        }
        modCounter = counter;
        this.data = newArray;

    }

    /**
     * ����������� ����� ����������� ������� �� 1.
     *
     * @param array - ������ ��� ����������.
     * @return - ������ ����������� �� 1.
     */
    private T[] grow(T[] array) {

        return data = Arrays.copyOf(data, data.length + 1);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}

