package ru.itsjava.enums;

public enum Coffee {
    ESPRESSO("Крепкий"), AMERICANO("С водой"), CAPPUCCINO("С молоком"), LATTE("Очень много молока");

   private final String characteristic;

    Coffee(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic(){
        return characteristic;
    }


    @Override
    public String toString() {
        return "Coffee{" + this.name() +
                " (characteristic='" + characteristic + ")}\n";
    }
}
