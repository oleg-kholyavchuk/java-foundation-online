package ru.itsjava.oop;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        ++age;
        System.out.println(age);
    }

    public boolean takeBeer() {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        System.out.println("Name-" + name + " " + "age-" + age + " " + "take beer-" + takeBeer());
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
}


