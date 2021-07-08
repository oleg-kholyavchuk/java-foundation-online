package ru.itsjava.collections.lists.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FruitShop {
    public static void main(String[] args) {

        Fruit peach = new Fruit("Peach", 144.66);
        Fruit cherry = new Fruit("Cherry", 6 );
        Fruit passionFruit = new Fruit("Passion Fruit", 250);

        Set<Fruit> fruits = new HashSet<>(Arrays.asList(peach, cherry, passionFruit));

        System.out.println("fruits = " + fruits);

        Fruit guava = new Fruit("Guava", 100);
        fruits.add(guava);
        System.out.println("fruits = " + fruits);

        Fruit guava2 = new Fruit("Guava", 100);
        fruits.add(guava2);
        System.out.println("fruits = " + fruits);

        System.out.println("fruits.remove(cherry) = " + fruits.remove(cherry));
        System.out.println("fruits.size() = " + fruits.size());
        System.out.println("fruits = " + fruits);
    }
}
