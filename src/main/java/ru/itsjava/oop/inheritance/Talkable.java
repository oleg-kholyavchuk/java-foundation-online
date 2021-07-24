package ru.itsjava.oop.inheritance;

public interface Talkable {
    void talk();

    default void talkMan() {
        System.out.println("Давай поболтаем?");
    }

    default void talkCow() {
        System.out.println("My-My-My");
    }

    default void talkPlant() {
        System.out.println("-------");
    }
}
