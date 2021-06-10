package ru.itsjava.exceptions;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean ageThrow() {

        try {
            if (age < 0) {
                throw new RuntimeException("Возраст меньше 0");
            } else if (age > 150) {
                throw new RuntimeException("Возраст больше 150");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("AgeNotValidException");
    }
}
