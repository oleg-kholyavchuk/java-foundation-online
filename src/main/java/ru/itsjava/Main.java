package ru.itsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int[] array2 = new int[]{8, 9, 7, 2, 4, 4, 4, 3, 3, 3, 3, 5, 1};

        String[] array = new String[]{"s1", "s2", "s3", "s4", "s2"};

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(14);
        integerList.add(1);
        integerList.add(19);

        System.out.println("integerList.toString() = " + integerList.toString());

        repeatedNumber(integerList);

        System.out.println("integerList.toString() = " + integerList.toString());

        System.out.println("bruteForce(array) = " + bruteForce(array));

//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://www.google.com/"))
//                .build();
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();


    }


    public static String bruteForce(String[] array) {

        String temp = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temp = array[i];
                }
            }
        }
        return temp;
    }

    public static int repeatedNumber( final List<Integer> list) {
        if (list.size() <= 1) {
            return -1;
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                return list.get(i);
            }
        }

        return -1;
    }
}
