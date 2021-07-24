package ru.itsjava.oop;

import java.util.Scanner;

public class MainTwentytwo {

    public static void main(String[] args) {


        Scanner temp = new Scanner(System.in);

        String name = temp.nextLine();
        int age = temp.nextInt();

        Person manMain = new Person(name, age);

        manMain.birthday();
        manMain.takeBeer();
        manMain.toString();
    }

}



