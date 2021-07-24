package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaly", 18000);
        Watch gShock = new Watch("GSHOCK", "Best dancer", 10000);
        List<String> temp = new ArrayList<>();
        temp.add("ssddsds");
        temp.add("fssddsds");
        temp.add("assddsds");
        temp.add("zssddsds");

        watchesList.add(seiko);
        watchesList.add(gShock);
        System.out.println(temp);
        Collections.sort(temp);
        System.out.println(temp);

        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }

        watchesList.remove(seiko);

        System.out.println("List");
        for (Watch elemWatch : watchesList) {
            System.out.println(elemWatch);
        }
        System.out.println();
        System.out.println("_______________");

        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));

        System.out.println("watchesList.toString() = " + watchesList);
        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());
        watchesList.set(0, seiko);

        System.out.println(watchesList);

        List<Watch> watchOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega","Andrew", 100_000.0);
        Watch romanOmega = new Watch("Omega","Roman", 100_000.0);

        watchOmegaList.add(andrewOmega);
        watchOmegaList.add(romanOmega);

        System.out.println("watchOmegaList = " + watchOmegaList);

        watchesList.addAll(watchOmegaList);
        System.out.println(watchesList);

        Watch vitaliyWatch = new Watch("Seiko", "Vitaliy", 20_000.0);

        watchesList.add(1, vitaliyWatch);
        System.out.println(watchesList);
        watchesList.remove("Seiko");

    }
}
