package ru.itsjava.oop;

public class Birds {
    private final String feathers;
    private final String song;
    private boolean flight;
    private double weight;

    public Birds(String feathers, boolean flight, double weight, String song) {
        this.feathers = feathers;
        this.flight = flight;
        this.weight = weight;
        this.song = song;
    }

    public String toString() {
        return "{" + "Цвет-" + feathers + " ; " + "Летает-" + flight + " ; " + " Вес-" + weight + " в кг " + " ; " + "Поет-" + song + "}";
    }


}
