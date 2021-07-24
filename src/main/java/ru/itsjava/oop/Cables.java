package ru.itsjava.oop;

public class Cables {
    private final String material;
    private final int numberofcores;
    private final double crosssection;

    public Cables(String material, int numberofcores, double crosssection) {
        this.material = material;
        this.numberofcores = numberofcores;
        this.crosssection = crosssection;
    }

    public String toString() {
        return "{" + "Матерьял жилы-" + material + " ; " + "Количество жил-" + numberofcores + " шт" + " ; " + "Сечение-" + crosssection + " мм" + "}";
    }
}
