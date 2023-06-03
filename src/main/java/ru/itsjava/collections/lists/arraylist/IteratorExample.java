package ru.itsjava.collections.lists.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Oleg");
        arrayList.add("Ivan");
        arrayList.add("Zaur");
        arrayList.add("Misha");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals("Zaur")) {
                iterator.remove();
            }
        }
        System.out.println("arrayList = " + arrayList);
    }
}
