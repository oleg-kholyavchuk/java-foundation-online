package ru.itsjava.oop;

public class Telephone {
    private final String brand;
    private boolean isHommey;

    public Telephone(String brand, boolean isHommey) {
        this.isHommey = isHommey;
        this.brand = brand;
    }

    public String toString() {
        return "{" + brand + " " + isHommey + "}";
    }
}

