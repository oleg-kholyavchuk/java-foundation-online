package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 18_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Viktor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko, dmitriySeiko, valentinOmega));

        System.out.println("Часы : " + watches);

        // Выводим все часы Seiko
        System.out.println("Выводим часы Seiko ");
        for (Watch element : watches) {
            if (element.getFirm().equals("Seiko")) ;
            System.out.print(element + " ");
        }
        System.out.println();

        // Выводим часы у которых цена больше 25к
        System.out.println("Выводим часы у которых цена больше 30к ");
        for (Watch price : watches) {
            if (price.getPrice() > 25_000.0) {
                System.out.print("Цена больше 25к " + price + " ");
            }
        }
        System.out.println();
        // Выводим одни часы у которых цена больше 25к
        System.out.println("Выводим одни часы у которых цена больше 30к ");
        for (Watch price : watches) {
            if (price.getPrice() > 25_000.0) {
                System.out.print("Одни часы с ценой больше 25к " + price);
                break;
            }
        }
        System.out.println();
        // Пропустить первые два элемена
        System.out.println("Пропустить первые два элемента фирмы Seiko");
        int seikoCount = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else {
                System.out.println(watches.get(i));
            }
        }
        watches.clear();
    }
}
