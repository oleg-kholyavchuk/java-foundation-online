package ru.itsjava.oop.inheritance;

public class Plant implements Eatable, Talkable {

    @Override
    public void talk() {
        System.out.println("--------");
    }

    @Override
    public void eat() {
        System.out.println("Микроэлементы");
    }
}



