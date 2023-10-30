package home_work_4.comparators;

import java.util.Comparator;
import java.util.Locale;

public class StringAlphabeticComparator implements Comparator<String> {
    /**
     * Сравнивает строки по алфавиту игнорируя CASE!.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return - -1 если первый символ строки о1 < первый символ строки о2,
     *            0 если первый символ строки о1 == первый символ строки о2,
     *            1 если первый символ строки о1 > первый символ строки о2.
     */
    @Override
    public int compare(String o1, String o2) {

        if (o1.toLowerCase(Locale.ROOT).charAt(0) < o2.toLowerCase(Locale.ROOT).charAt(0)) {
            return -1;
        } else if (o1.toLowerCase(Locale.ROOT).charAt(0) == o2.toLowerCase(Locale.ROOT).charAt(0)) {
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
