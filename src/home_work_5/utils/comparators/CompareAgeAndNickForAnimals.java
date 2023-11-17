package home_work_5.utils.comparators;

import home_work_5.DTO.Animal;

import java.util.Comparator;

public class CompareAgeAndNickForAnimals implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() == o2.getAge()) {
            return o1.getNick().compareTo(o2.getNick());
        } else {
            return 1;
        }
    }
}
