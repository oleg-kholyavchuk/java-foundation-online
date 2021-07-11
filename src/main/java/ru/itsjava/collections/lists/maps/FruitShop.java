package ru.itsjava.collections.lists.maps;

import java.util.*;

public class FruitShop {
    public static void main(String[] args) {

        Fruit peach = new Fruit("Peach", 144.66);
        Fruit cherry = new Fruit("Cherry", 6 );
        Fruit passionFruit = new Fruit("Passion Fruit", 250);
        Fruit banana = new Fruit("Banana", 200);
        Fruit orange = new Fruit("Orange", 130);

        Map<Man, Fruit> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        men.put(ivanov, peach);
        men.put(sidorov, cherry);
        men.put(javov, passionFruit);
        men.put(sidorov,banana);
        men.put(ivanov, orange);

        System.out.println("men.size() = " + men.size());
        System.out.println("men.put(ivanov, peach) = " + men.put(ivanov, peach));
        System.out.println("men.remove(passionFruit) = " + men.remove(passionFruit));
        System.out.println("men.size() = " + men.size());
        System.out.println("men.get(javov) = " + men.get(javov));
        System.out.println("men.remove(passionFruit) = " + men.remove(sidorov, cherry));
        System.out.println("men.get(javov) = " + men.get(javov));
        System.out.println("----------------------------------"); //keySet

        for (Man keyMan : men.keySet()){
            System.out.println(keyMan + ": " + men.get(keyMan));
        }
        System.out.println("----------------------------------");

        System.out.println("men.entrySet() = " + men.entrySet());
        System.out.println("----------------------------------");

        for (Man keyMan : men.keySet()){
            System.out.println(men.get(keyMan));
        }
    }
}
