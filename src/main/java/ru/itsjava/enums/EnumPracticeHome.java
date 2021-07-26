package ru.itsjava.enums;

public class EnumPracticeHome {

    public static void main(String[] args) {

        Week[] weeks = Week.values();

        for (Week week : weeks) {
            System.out.print(week + "");
        }
        System.out.println();
    }
}
