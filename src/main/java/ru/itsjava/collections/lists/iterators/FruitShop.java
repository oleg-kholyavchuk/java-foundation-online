package ru.itsjava.collections.lists.iterators;

import ru.itsjava.collections.lists.maps.Man;

import java.util.*;

public class FruitShop {
    public static void main(String[] args) {

        Fruit peach = new Fruit("Peach", 144.66);
        Fruit cherry = new Fruit("Cherry", 6);
        Fruit passionFruit = new Fruit("Passion Fruit", 250);
        Fruit banana = new Fruit("Banana", 200);
        Fruit orange = new Fruit("Orange", 130);
        Fruit watermelon = new Fruit("Watermelon", 6030);
        Fruit melon = new Fruit("Melon", 6030);

        Map<Man, Fruit> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");
        Man smirnov = new Man("Смирнов");
        Man simon = new Man("Симон");
        Man adenis = new Man("Эденис");

        men.put(ivanov, peach);
        men.put(sidorov, cherry);
        men.put(javov, passionFruit);
        men.put(smirnov, banana);
        men.put(simon, orange);
        men.put(adenis, watermelon);

        System.out.println(men.size());

        System.out.println("Вернуть количество ключей длина которых больше 5");
        for (Man name : men.keySet()) {
            if (name.getName().length() > 5) {
                System.out.println("Name " + name);
            }
        }

        System.out.println("Вернуть количество элементов которые равны дыни"); // Тут не совсем понял
        for (Fruit fruit : men.values()) {
            if (fruit.getTitle().equals("Melon")) {
                System.out.println("Fruit " + fruit);
            }
            System.out.println("*****");
        }

        System.out.println("Пропускаем элементы арбуз");
        for (Fruit fruit : men.values()) {
            if (!fruit.getTitle().equals("Watermelon")) {
                System.out.println("Fruit " + fruit);
            }
        }

        System.out.println("Выводим элементы не начинающиеся на букву 'C' ");
        for (Man name : men.keySet()) {
            if (!name.getName().contains("С")) {
                System.out.println("Name " + name);
            }
        }

        System.out.println("Возвращаем значение которого арбуз");
        for (Fruit fruit : men.values()) {
            if (fruit.getTitle().contains("Watermelon")) {
                System.out.println("Fruit " + fruit);
            }
        }

        Map men2 = new HashMap<>();
//        Man sofi = new Man("Sofi");
//        Man soni = new Man("Soni");
//        Man julia = new Man("Julia");
//        Man natali = new Man("Natali");
//        Man linda = new Man("Linda");
//        Man falin = new Man("Falin");

        men2 = (HashMap) ((HashMap<Man, Fruit>) men).clone();
        System.out.println(men2);


        men.forEach(men2::put);
        System.out.println(men2.size());
        System.out.println(men2);

//        for (Man keyMan : man2.keySet()) {
//            System.out.println(keyMan + ": " + man2.get(keyMan));
//        }

//        for (Fruit fruit : men.values()) {
//            if (fruit.getTitle().equals()) {
//                System.out.println("Fruit " + fruit);
//            }
    }
}


