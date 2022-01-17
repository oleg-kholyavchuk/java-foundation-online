package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
public class ArrayListPractice {
    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<>();
        Watch seiko = new Watch("Seiko", "Vitaly", 18000);
        Watch gShock = new Watch("GSHOCK", "Best dancer", 10000);
        List<String> temp = new ArrayList<>();

        temp.add("dfdfdgdd");
        temp.add("fssddsds");
        temp.add("assddsds");
        temp.add("zssddsds");
        //String[] wordsArray = temp.toArray(new String[0]);

        watchesList.add(seiko);
        watchesList.add(gShock);
        System.out.println(temp);
        Collections.sort(temp);
        watchesList.sort(new Comparator<Watch>() {
            @Override
            public int compare(Watch o1, Watch o2) {
                if (o1.getPrice() == o2.getPrice()) return 0;
                else if (o1.getPrice() > o2.getPrice()) return 1;
                else return -1;
            }
        });
        for(int i =0 ; i<watchesList.toArray().length; i++)
        {
            System.out.println(watchesList.get(i).getFirm()+" "+watchesList.get(i).getAuthor());
        }
        System.out.println("------------------------------");
        System.out.println(temp);

        System.out.println("Вывод");

        for (String word : temp) {
            System.out.println(word);
        }



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
        Watch andrewOmega = new Watch("Omega", "Andrew", 100_000.0);
        Watch romanOmega = new Watch("Omega", "Roman", 100_000.0);

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
