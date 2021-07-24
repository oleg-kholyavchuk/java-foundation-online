package ru.itsjava.oop.inheritance;

public interface Father {


    default void giveLove(){
        System.out.println("Father love you");
    }
}
