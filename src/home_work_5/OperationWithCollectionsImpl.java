package home_work_5;

import home_work_5.DTO.Animal;
import home_work_5.DTO.Person;
import home_work_5.utils.GenerateRandomName;
import home_work_5.utils.comparators.CompareAgeAndNickForAnimals;
import home_work_5.utils.comparators.ComparePasswordLengthForPerson;

import java.util.*;

public class OperationWithCollectionsImpl implements Operations {

    // 6.0
    @Override
    public <T> void doOperations(T t, Collection collection, int count) {

        if (t instanceof Person) {

            stoppedTime(() -> generateObjectAndFillCollection((Person) t, collection, count), "Заполнение коллекции Person " + collection.getClass().getName());

            if (collection instanceof List) {
                sortCollection((List) collection, new ComparePasswordLengthForPerson());
                sortCollectionWithJDK((List) collection, new ComparePasswordLengthForPerson());
            }


        } else {
            stoppedTime(() -> generateObjectAndFillCollection((Animal) t, collection, count), "Заполнение коллекции Animal " + collection.getClass().getName());

            if (collection instanceof List) {
                sortCollection((List) collection, new CompareAgeAndNickForAnimals());
                sortCollectionWithJDK((List) collection, new CompareAgeAndNickForAnimals());
            }

        }

        stoppedTime(() -> iterateCollection(collection, true), "Итерирование коллекции (iterator) " + collection.getClass().getName());
        stoppedTime(() -> iterateCollection(collection, false), "Итерирование коллекции (не foreach) " + collection.getClass().getName());
        stoppedTime(() -> removeElements(collection), "Удаление всех элементов коллекции " + collection.getClass().getName());

    }

    /**
     * Генерирует объекты и заполняет ими коллекцию.
     *
     * @param person
     * @param collection
     * @param count
     */
    private void generateObjectAndFillCollection(Person person, Collection<Person> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(new Person
                    (GenerateRandomName.generateRussianName(),
                            UUID.randomUUID().toString().substring(0, 9),
                            GenerateRandomName.generateRandomName()));
        }
    }

    /**
     * Генерирует объекты и заполняет ими коллекцию.
     *
     * @param animal
     * @param collection
     * @param count
     */
    private void generateObjectAndFillCollection(Animal animal, Collection<Animal> collection, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            collection.add(new Animal(
                    random.nextInt(15) + 1,
                    GenerateRandomName.generateRealName()));
        }
    }

    /**
     * Сортировка коллекции с использованием компаратора.
     *
     * @param list
     * @param comparator
     * @param <T>
     */
    private static <T> void sortCollection(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    /**
     * Сортировка коллекции с использованием компаратора.
     *
     * @param list
     * @param comparator
     * @param <T>
     */
    private static <T> void sortCollectionWithJDK(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    /**
     * Итерирует коллекцию.
     *
     * @param collection
     * @param useIterator - еслт true использует итератор, если false использует fori
     * @param <T>         - тип.
     */
    private static <T> void iterateCollection(Collection<T> collection, boolean useIterator) {
        if (useIterator) {
            Iterator<T> iterator = collection.iterator();
            while (iterator.hasNext()) {
                T element = iterator.next();
//                printElement(element.toString());
            }
        } else {
            Object[] o = collection.toArray();
            for (int i = 0; i < o.length; i++) {
//                printElement(o[i].toString());
            }
        }
    }

    /**
     * Удаляет все элементы из коллекции.
     *
     * @param collection
     * @param <T>        - тип.
     */
//    private static <T> void removeElements(Collection<T> collection) {
//        Iterator<T> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }
//    }

    /**
     * Удаляет все элементы из коллекции.
     *
     * @param collection
     */
    private static void removeElements(Collection collection) {
       Object [] o = collection.toArray();
        for (int i = 0; i < o.length; i++) {
            collection.remove(o[i]);
        }
    }

    /**
     * Выводит в консоль переданную коллекцию.
     *
     * @param collection
     */
    private static void printCollection(Collection collection) {
        System.out.println("Коллекция: " + collection);
    }

    /**
     * Выводит в консоль переданную строку.
     *
     * @param element
     */
    private static void printElement(String element) {
        System.out.println("Элемент: " + element);
    }

    /**
     * Замеряет время исполнения переданного метода.
     *
     * @param operation     - передаваемый поток с исполняемым методом.
     * @param operationName - имя операции для формирования отчета.
     */
    private static void stoppedTime(Runnable operation, String operationName) {
        long startTime = System.currentTimeMillis();
        operation.run();
        long endTime = System.currentTimeMillis();
        System.out.println("Операция: " + operationName + ". Заняла " + (endTime - startTime) + " мс");
    }

}
