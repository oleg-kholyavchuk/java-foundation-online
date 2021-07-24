package ru.itsjava.oop.inheritance;
//
//import ru.itsjava.interfaces.Man;

public interface Eatable {
    void eat();

    default void eatMan() {
        System.out.println("Ем все подряд");
    }

    default void eatCow() {
        System.out.println("Люблю сочную траву");
    }

    default void eatPlant() {
        System.out.println("Ультрофиолет");
    }
}
