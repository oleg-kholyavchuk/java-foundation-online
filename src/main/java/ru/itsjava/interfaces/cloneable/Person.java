package ru.itsjava.interfaces.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surname;
    private final int age;

    @Override
    public int compareTo(Person person) {
        int temp = this.name.compareTo(person.name);
        int tempAge = age - person.age;
        if (temp <= 0) {
            temp = this.surname.compareTo(person.surname);
            return temp;
        } else if (temp >= 0) {
            temp = this.surname.compareTo(person.surname);
            return temp;
        }
//        return (age - person.age);

        if(tempAge != 0)
            return (int) tempAge / Math.abs( tempAge );

        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "Person {" + name + ", " + surname + ", " + age + "}";
    }
}

