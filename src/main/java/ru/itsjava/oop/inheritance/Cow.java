package ru.itsjava.oop.inheritance;

public class Cow implements Eatable, Talkable {
    @Override
    public void talk() {
        System.out.println("Муууууууууууу");
    }

    @Override
    public void eat() {
        System.out.println("Растения");
    }
}
