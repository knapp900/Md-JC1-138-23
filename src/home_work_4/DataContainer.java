package home_work_4;

import java.util.*;
import java.util.function.Consumer;

/*
Задание:
+1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T.
Данный класс как раз и будет решать задачу поставленную перед нами:
хранить неограниченное количество передаваемых объектов обобщённого типа.
+2. Внутри DataContainer должно быть поле T[] data,
внутренний массив, которое предназначено для хранения передаваемых объектов.
Да, именно T[] а не Object[]. Если использовать Object[] то это будет опасно и постоянно придётся делать приведеление
типов. Поле обязательно не static и private
+3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
+4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает
номер позиции в которую были вставлены данные, начиная с 0.
+	4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной
	позиции (ячейки).
		4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data =
		[1, 2, 3, 777, null, null]. Метод add вернёт число 3.
		4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data =
		[1, 2, 3, null, null, null]. Метод add вернёт число -1.
		-1 будет индикатором того что данный элемент в наш контейнер вставлять нельзя.
		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data =
		[1, 777, 3, null, null, null]. Метод add вернёт число 1.
+	4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для новых
	элементов. Тут вам поможет Arrays.copyOf.
		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
		4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
+5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data,
предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0).
	Метод get возвращает 9999
	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
+6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает массив из поля data.
+7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
	7.1 Метод возвращает true если у нас получилось удалить данные.
		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3].
		Метод delete вернёт true
	7.2 Метод возвращает false если нет такого индекса.
		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777].
		Метод delete вернёт false
	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777].
		Метод delete вернёт true
+8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
	8.1 Метод возвращает false если передают null.
		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777]
		8.1.2 Пример data = [1, 2, 3, 777, null]. Вызывают delete(null). Метод delete вернёт false a data =
		[1, 2, 3, 777, null]
	8.2 Метод возвращает true если у нас получилось удалить данные.
		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3].
		Метод delete вернёт true
	8.3 Метод возвращает false если нет такого элемента.
		8.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777].
		Метод delete вернёт false
	8.4 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
		8.4.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3].
		Метод delete вернёт true
-9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator).
Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО
объекта comparator. Классом Arrays пользоваться запрещено. Интефейс Comparator обязательно должен быть реализован
отдельным классом. Для каждого типа данных и сравнений программист создаёт отдельную реализацию интерфейса Comparator.
	9.1 Пример data = [3, 1, 3, 777]. Вызывают sort(....) передавая компаратор чисел. Должно получиться data = [1, 3, 3, 777]
	9.2 Пример data = ["i", "hello", "1", "Как домашка"]. Вызывают sort(....) передавая компаратор строк по длинне.
	Должно получиться data = ["i", "1", "hello", "Как домашка"]
+10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
	10.1 Пример data = [1, 2, 3, 777, 3]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3, 777, 3]
	10.2 Пример data = [1, 2, 3, null]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3]
	10.3 Пример data = []. Вызывают toString() у созданного DataContainer. Возвращается строка []
11.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container) с дженериком
extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию
сравнения вызываемый у хранимых объектов. Для этого надо сделать дженерик метод.
12.* В DataContainer добавить СТАТИЧЕСКИЙ метод
void sort(DataContainer<.............> container, Comparator<.......> comparator) который будет принимать объект
DataContainer и реализацию интерфейса Comparator. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
13.** Реализовать в DataContainer интерфейс Iterable
 */
public class DataContainer<T> implements Iterable<T> {
    /**
     * Поле в котором хранится информация.
     */
    private T[] data;
    /**
     * Поле в котором храниться позиция последнего добавленного элемента.
     */
    private int modCounter = 0;

    public DataContainer() {
        this.data = ((T[]) new Object[10]);
    }

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Добавление элемента в контейнер.
     *
     * @param item - передаваемый <T> элемент.
     * @return - индекс в хранилище.
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
     * Помещает элемент в первую ячейку с null.
     *
     * @param element - элемент.
     * @return - индекс ячейки в которую было размещен элемент,
     * -1 если не удалось поместить элемент.
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
     * Получение элемента по индексу.
     *
     * @param index - индекс элемента.
     * @return - элемент <T>.
     */
    public T get(int index) {

        if (index < data.length && index >= 0) {

            return data[index];
        }
        return null;
    }

    /**
     * Получение всех элементов.
     *
     * @return - массив <T> элементов.
     */
    public T[] getItems() {

        if (!this.isEmpty()) {

            return data;
        }
        return null;
    }

    /**
     * Удаляет элемент по индексу.
     *
     * @param index - индекс элемента.
     * @return - true если удаление прошло успешно и false если нет
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
     * Удаляет элемент по переданному элементу.
     *
     * @param item - элемент.
     * @return - true если удаление прошло успешно и false если нет
     * ,false если передан null.
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
     * Проверка пустой ли массив.
     *
     * @return - true если пуст,false если нет.
     */
    public boolean isEmpty() {

        return modCounter == 0 ? true : false;
    }

    /**
     * Печатает все элементы кроме null.
     *
     * @return - элементы массива.
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
     * Размер хранилища.
     *
     * @return - размер.
     */
    public int size() {

        return modCounter;
    }

    /**
     * Метод сортировки для контейнеров с объектами, реализующими интерфейс Comparable.
     *
     * @param comparator - контейнер для сортировки.
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
     * Устанавливает элемент в массив по указанному индексу.
     *
     * @param index   - индекс.
     * @param element - элемент.
     */
    public void set(int index, T element) {

        for (int i = 0; i < data.length; i++) {

            if (i == index) {
                data[i] = element;
            }
        }
    }

    /**
     * Метод пузырьковой сортировки для контейнеров с объектами, реализующими интерфейс Comparable.
     *
     * @param container - объект контейнер.
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
     * Метод пузырьковой сортировки для контейнеров с объектами и передаваемым компаратором.
     *
     * @param container  - Объект DataContainer<T>.
     * @param comparator - Объект Comparator<T>.
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
     * Метод исключает из поля data все null и перезаписывает массив без null.
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
     * Увеличивает длину переданного массива на 1.
     *
     * @param array - массив для увеличения.
     * @return - массив увеличенный на 1.
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

