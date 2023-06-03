package ru.itsjava.interfaces.cloneable;

import java.util.Arrays;

public class MainNineteen {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person man = new Person("Den", "Senies", 36);
        Person woman = new Person("Din", "Anelin", 67);
        Person woman1 = new Person("Din", "Anelin", 6);

        Person man2 = (Person) man.clone();
        Person woman2 = (Person) woman.clone();
        System.out.println("man2 = " + man2);
        System.out.println("woman2 = " + woman2);
        System.out.println();

        System.out.println(man);
        System.out.println(woman);
        System.out.println();

        System.out.println("man.compareTo(woman) = " + man.compareTo(woman));

        Person[] person = {man, woman, woman1};
        System.out.println("Arrays.toString(person) = " + Arrays.toString(person));
        Arrays.sort(person);
        System.out.println();
        System.out.println("Arrays.toString(person) = " + Arrays.toString(person));
    }
}
