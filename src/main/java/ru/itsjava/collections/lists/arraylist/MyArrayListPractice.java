package ru.itsjava.collections.lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        MyArrayList list1 = new MyArrayList();
        System.out.println(list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println(list.size());
        list.add("Привет");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
//        list.add("Пока");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        list.add(0,"ffdssd");
        System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list1.isEmpty());
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains() = " + list.contains("Пока"));
        System.out.println("------------------");
        System.out.println("list.get(3) = " + list.get(0));
        list.set(0, "llll");
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());

        list.add("Пока1");
        list.add("Пока2");
        list.add("Пока3");
        list.add("Пока4");
        list.add("Пока5");
        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("-------------------------");
        list.add(1,"dfdfdf");
        System.out.println("--------------------------");
        System.out.println("list = " + list);
        System.out.println("--------------------------");
        System.out.println("list.lastIndexOf(\"dfdfdf\") = " + list.lastIndexOf("dfdfdf"));
        System.out.println("list.remove(\"dfdfdf\") = " + list.remove("dfdfdf"));
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.remove(\"Пока\") = " + list.remove("Пока"));
        System.out.println("list.size() = " + list.size());
        list.add("До_свидание");
        System.out.println("list = " + list);
        list.remove(2);
        System.out.println("list = " + list);
        list.remove("Пока2");
        System.out.println("------------------------");
        System.out.println("list = " + list);
        list.add(3,"EEEEEE");
        System.out.println("list = " + list);
        list.remove("sfsfs");


    }
}
