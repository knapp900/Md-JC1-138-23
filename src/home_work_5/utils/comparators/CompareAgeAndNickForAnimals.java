package home_work_5.utils.comparators;

import home_work_5.DTO.Animal;

import java.util.Comparator;

public class CompareAgeAndNickForAnimals implements Comparator<Animal> {
    /**
     * Сравнивает по длине age если age одинаковой длинны сравнивает по нику
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
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
