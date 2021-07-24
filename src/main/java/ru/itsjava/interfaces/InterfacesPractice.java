package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
        Creatable khotabich = new Gin();
        khotabich.createWish();

        Creatable badGin = new BadGin();
        badGin.createWish();
        System.out.println();

        khotabich.canYouCreateWish();
        badGin.canYouCreateWish();

//        Walkable manWalk = new Man();
//        manWalk.walk();
//        System.out.println();
//
//        Flyable birdFly = new Bird();
//        birdFly.fly();
//        System.out.println("manFly.flyMaxDistance() = " + birdFly.flyMaxDistance());
//        System.out.println();
//
//        Runnable catRun = new Cat();
//        catRun.run();



    }
}
