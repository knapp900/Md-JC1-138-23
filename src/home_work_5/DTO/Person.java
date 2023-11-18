package home_work_5.DTO;

import home_work_5.utils.ValidationForPersonPassword;

import java.util.Objects;

/*
1.Создаём классы только для хранения информации об объектах (DTO):
	1.1. Написать класс Person который содержит поля:
		1.1.1. Строку nick - псевдоним пользователя
		1.1.2. Строку password - пароль (от 5 до 10 символов)
		1.1.3. Строку name - имя пользователя
 */
public class Person implements Comparable<Person> {

    private String nick;
    private String password;
    private String name;

    public Person(){}

    public Person(String nick, String password, String name) throws IllegalArgumentException {
        this.nick = nick;
        setPassword(password);
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {

        if (ValidationForPersonPassword.isValid(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Неверная длинна пароля");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
