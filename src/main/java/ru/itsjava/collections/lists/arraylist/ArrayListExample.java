package ru.itsjava.collections.lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Oleg");
        arrayList.add("Ivan");
        arrayList.add("Zaur");
        arrayList.add("Misha");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.set(2, "Masha");


        System.out.println(arrayList);

        List<String> myList = arrayList.subList(1,3);
        myList.add("Valin");

        System.out.println(myList);
        System.out.println(arrayList);
        arrayList.add("Kolya");
//        System.out.println(myList);
        System.out.println(arrayList);

        List<Integer> list = List.of(3, 8, 13);

        System.out.println(list);

    }
}
