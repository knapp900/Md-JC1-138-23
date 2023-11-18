package home_work_5;

import java.util.Collection;

public interface Operations {
    /**
     * Выполняет операции генерации, заполнения, сортировки и замера времени операций над коллекцией из задания 6.
     *
     * @param t          - Person or Animal для идентификации передаваемой коллекции.
     * @param collection - коллекция <T>.
     * @param count      - количество объектов для заполнения коллекции.
     * @param <T>
     */
    <T> void doOperations(T t, Collection collection, int count);
}
