package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    private final String stamp;
    private final String color;
    public static double price = 5;

    @Override
    public String toString() {
        return "Car{" +
                "stamp='" + stamp + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
