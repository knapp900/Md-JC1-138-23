package home_work_4;

import home_work_4.comparators.StringAlphabeticComparator;
import home_work_4.comparators.StringLengthComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class DataContainerTest {

    private DataContainer<String> containerOfStrings = new DataContainer<>();

    @Test
    public void add() {

        Assertions.assertEquals(containerOfStrings.add("Hello"), 0);
        Assertions.assertEquals(containerOfStrings.add(" "), 1);
        Assertions.assertEquals(containerOfStrings.add("World"), 2);
    }

    @Test
    public void addNull() {

        Assertions.assertEquals(containerOfStrings.add(null), -1);
    }

    @Test
    public void get() {

        Assertions.assertEquals(containerOfStrings.add("Hello"), 0);
        Assertions.assertEquals(containerOfStrings.get(0), "Hello");
    }

    @Test
    public void getItems() {

        String[] patternArray = {"Hello", " ", "World"};

        containerOfStrings.add("Hello");
        containerOfStrings.add(" ");
        containerOfStrings.add("World");

        Assertions.assertArrayEquals(containerOfStrings.getItems(), patternArray);
    }

    @Test
    public void deleteByIndex() {

        containerOfStrings.add("Hello");
        containerOfStrings.add(" ");
        containerOfStrings.add("World");

        Assertions.assertTrue(containerOfStrings.delete(0));
        Assertions.assertNull(containerOfStrings.get(0));
    }

    @Test
    public void deleteByElement() {

        containerOfStrings.add("Hello");
        containerOfStrings.add(" ");
        containerOfStrings.add("World");

        Assertions.assertTrue(containerOfStrings.delete("Hello"));
        Assertions.assertNull(containerOfStrings.get(0));
    }

    @Test
    public void isEmptyWhitElements() {

        containerOfStrings.add("Hello");
        containerOfStrings.add(" ");
        containerOfStrings.add("World");

        Assertions.assertFalse(containerOfStrings.isEmpty());
    }

    @Test
    public void isEmptyWithoutElements() {

        Assertions.assertTrue(containerOfStrings.isEmpty());
    }

    public void toStringTest() {

    }

    @Test
    public void size() {

        containerOfStrings.add("Hello");
        containerOfStrings.add(" ");
        containerOfStrings.add("World");

        Assertions.assertEquals(containerOfStrings.size(), 3);
    }

    @Test
    public void set() {

        containerOfStrings.add("Hello");
        containerOfStrings.add(" ");
        containerOfStrings.add("World");

        containerOfStrings.set(0, "Hi");

        Assertions.assertEquals(containerOfStrings.get(0), "Hi");
    }

    @Test
    public void sortWhitElementsThatImplementsComparator_1() {

        containerOfStrings.add("c");
        containerOfStrings.add("d");
        containerOfStrings.add("a");
        containerOfStrings.add("b");

        containerOfStrings.sort(new StringAlphabeticComparator());

        String[] example = {"a", "b", "c", "d"};

        Assertions.assertArrayEquals(containerOfStrings.getItems(), example);

    }

    @Test
    public void sortWhitElementsThatImplementsComparator_2() {

        containerOfStrings.add("c");
        containerOfStrings.add("d");
        containerOfStrings.add("a");
        containerOfStrings.add("b");

        DataContainer.sort(containerOfStrings);

        String[] example = {"a", "b", "c", "d"};

        Assertions.assertArrayEquals(containerOfStrings.getItems(), example);

    }

    @Test
    public void sortWhitTransmittableComparator() {

        containerOfStrings.add("cc");
        containerOfStrings.add("ddd");
        containerOfStrings.add("aaaaa");
        containerOfStrings.add("b");

        DataContainer.sort(containerOfStrings, new StringLengthComparator());

        String[] example = {"b", "cc", "ddd", "aaaaa"};

        Assertions.assertArrayEquals(containerOfStrings.getItems(), example);
    }

    @Test
    public void iterator() {

        containerOfStrings.add("c");
        containerOfStrings.add("d");
        containerOfStrings.add("a");
        containerOfStrings.add("b");

        Iterator<String> itr = containerOfStrings.iterator();

        int counter = 0;
        String[] example = new String[containerOfStrings.size()];

        while (itr.hasNext()) {

            example[counter] = itr.next();
            counter++;
        }

        Assertions.assertArrayEquals(containerOfStrings.getItems(), example);
    }

    @Test
    public void forEach() {

        DataContainer<String> container = new DataContainer<>();

        containerOfStrings.add("c");
        containerOfStrings.add("d");
        containerOfStrings.add("a");
        containerOfStrings.add("b");

        containerOfStrings.forEach(s -> container.add((String) s));

        Assertions.assertArrayEquals(containerOfStrings.getItems(), container.getItems());

    }

}
