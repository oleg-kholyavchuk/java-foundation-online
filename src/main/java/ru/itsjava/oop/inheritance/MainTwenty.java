package ru.itsjava.oop.inheritance;

import java.util.Scanner;

public class MainTwenty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = scan.nextDouble();

        Figure circle = new Circle(radius);
        System.out.println(circle);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("circle.getPerimetr() = " + circle.getPerimetr());
        System.out.println();

        Eatable manEat = new Man();
        Talkable manTalk = new Man();
        manEat.eat();
        manEat.eatMan();
        manTalk.talk();
        manTalk.talkMan();
        System.out.println();

        Eatable cowEat = new Cow();
        Talkable cowTalk = new Cow();
        cowEat.eat();
        cowEat.eatCow();
        cowTalk.talk();
        cowTalk.talkCow();
        System.out.println();

        Eatable plantEat = new Plant();
        Talkable plantTalk = new Plant();
        plantEat.eat();
        plantEat.eatPlant();
        plantTalk.talk();
        plantTalk.talkPlant();
    }
}
