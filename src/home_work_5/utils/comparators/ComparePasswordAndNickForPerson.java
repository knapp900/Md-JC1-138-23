package home_work_5.utils.comparators;

import home_work_5.DTO.Person;

import java.util.Comparator;

public class ComparePasswordAndNickForPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPassword().length() < o2.getPassword().length()) {
            return -1;
        } else if (o1.getPassword().length() == o2.getPassword().length()) {
            return o1.getNick().compareTo(o2.getNick());
        } else {
            return 1;
        }
    }
}
