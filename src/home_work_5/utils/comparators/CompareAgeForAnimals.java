package home_work_5.utils.comparators;

import home_work_5.DTO.Animal;

import java.util.Comparator;

public class CompareAgeForAnimals implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }
}
