package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {

        Boy vitalic = new Boy("Vitalic", 15, 165);
        Boy vasya = new Boy("Vasya", 14, 160);
        Boy vanya = new Boy("Vanya", 18, 180);

        System.out.println("vitalic.compareTo(vasya) = " + vitalic.compareTo(vasya));
        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));

        Boy[] boys = {vitalic, vasya, vanya};
        System.out.println(boys.length);
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
    }
}
