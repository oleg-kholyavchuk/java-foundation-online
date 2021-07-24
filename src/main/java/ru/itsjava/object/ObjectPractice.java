package ru.itsjava.object;

import java.util.ArrayList;
import java.util.List;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog myhtar1 = new Dog("Мухтар", 4);
        Dog myhtar2 = new Dog("Мухтар", 4);
        Dog pysa = new Dog("Пуся", 4);

        System.out.println("myhtar1.equals(myhtar2) = " + myhtar1.equals(myhtar2));
        System.out.println("myhtar1.equals(pysa) = " + myhtar1.equals(pysa));
        System.out.println("myhtar1.equals(obj1) = " + myhtar1.equals(obj1));
        System.out.println("pysa.toString() = " + pysa);
        System.out.println();

        Knife knife1 = new Knife("Стальной", 3460);
        Knife knife2 = new Knife("Керамический", 1600);
        Knife knife3 = new Knife("Деревянный", 540);
        Knife knife4 = new Knife("Стальной", 3460);
        Knife knife5 = new Knife("Стальной", 3460);

        System.out.println("knife1.equals(knife2) = " + knife1.equals(knife2));
        System.out.println("knife1.equals(knife4) = " + knife1.equals(knife4));
        System.out.println("knife4.equals(knife5) = " + knife4.equals(knife5));
        System.out.println("knife3.equals(knife2) = " + knife3.equals(knife2));
        System.out.println("knife1.toString() = " + knife1);
        System.out.println("knife2.toString() = " + knife2);
        System.out.println("knife3.toString() = " + knife3);
        System.out.println("knife4.toString() = " + knife4);
        System.out.println("knife5.toString() = " + knife5);
    }
}
