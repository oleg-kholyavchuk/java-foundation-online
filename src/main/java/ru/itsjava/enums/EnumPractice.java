package ru.itsjava.enums;

public class EnumPractice {

    public static void main(String[] args) {

        System.out.println("Season.WITER = " + Season.WINTER);

        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.print(season + "");
        }
        System.out.println();

        Season season = Season.WINTER;
        switch (season) {
            case FALL:
                System.out.println("У нас осень");
                break;
            case SPRING:
                System.out.println("У нас весна");
                break;
            case SUMMER:
                System.out.println("У на с лето");
                break;
            case WINTER:
                System.out.println("У нас зима");
            default:
                System.out.println("У нас не весна и не осень");
        }

        System.out.println("Coffee.CAPPUCCINO = " + Coffee.CAPPUCCINO);
        System.out.println("Coffee.valueOf(\"CAPPUCCINO\") = " + Coffee.valueOf("CAPPUCCINO"));

    }
}
