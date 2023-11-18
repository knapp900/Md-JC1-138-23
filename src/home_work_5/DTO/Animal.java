package home_work_5.DTO;

import home_work_5.utils.ValidationForAnimalAge;

import java.util.Objects;

/*
	1.2. Написать класс Animal:
		1.2.1. Число age - возраст (от 1 до 15 лет)
		1.2.2. Строка nick - кличка
 */
public class Animal implements Comparable<Animal>  {

    private int age;
    private String nick;

    public Animal(){}

    public Animal(int age, String nick) throws IllegalArgumentException {
        setAge(age);
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {

        if (ValidationForAnimalAge.isValid(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Неверный возраст" + age);
        }
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.nick.compareTo(o.nick);
    }
}
