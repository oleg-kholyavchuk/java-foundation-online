package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        MyLinkedList list1 = new MyLinkedList();

        list.add("Строка 1");
        System.out.println("list = " + list);
        list.add("Строка 2");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        list.add("Строка 3");
        System.out.println("list.size() = " + list.size());
        System.out.println(list);
        System.out.println("list.remove(\"Строка 4\") = " + list.remove("Строка 4"));
        System.out.println(list);

        System.out.println("list = " + list);

        System.out.println("list.contains(\"ddddddd\") = " + list.contains("ddddddd"));
        System.out.println("list.contains(\"Строка 2\") = " + list.contains("Строка 2"));
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.isEmpty() = " + list1.isEmpty());
        System.out.println("list.get(1) = " + list.get(1));
        list.set(1,"wrwrwrwrw");
        System.out.println(list);

        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.lastIndexOf(\"Строка 2\") = " + list.lastIndexOf("Строка 2"));
        System.out.println("list.indexOf(\"wrwrwrwrw\") = " + list.indexOf("wrwrwrwrw"));
        list.lastIndexOf("Строка 1");
        System.out.println(list);
        list.clear();
        System.out.println("__________________________________________");
        System.out.println(list);



    }
}
