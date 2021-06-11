package ru.itsjava.exceptions;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void ageThrow() {

        try {
            if (age < 0 || age > 150) {
                throw new RuntimeException("Возраст, Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("AgeNotValidException");
        }
    }
}
