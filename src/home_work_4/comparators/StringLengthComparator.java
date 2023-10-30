package home_work_4.comparators;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    /**
     * Сравнивает строки по длине.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return - -1 если строка о1.length() < строка о2.length(),
     *            0 если строка о1.length() == строка о2.length(),
     *            1 если строка о1.length() > строка о2.length().
     */
    @Override
    public int compare(String o1, String o2) {

        if (o1.length() < o2.length()) {
            return -1;
        } else if (o1.length() == o2.length()) {
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
