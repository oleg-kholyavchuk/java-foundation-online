package ru.itsjava.oop.inheritance;

public class Man implements Eatable, Talkable {
    @Override
    public void talk() {
        System.out.println("Знаю много языков. Любдю болтать");
    }

    @Override
    public void eat() {
        System.out.println("Ем все!!!");
    }
}
