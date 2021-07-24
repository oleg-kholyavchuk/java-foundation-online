package ru.itsjava.oop.inheritance;

public class Circle extends Figure {
    private final double diameter;
    private final double radius;
    private static final double PI = 3.1415926535;

    public Circle(double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimetr() {
        return (2 * PI) * radius;
    }

    @Override
    public String toString() {
        return "Circle {diameter = " + diameter +
                ", radius = " + radius + '}';
    }
}
