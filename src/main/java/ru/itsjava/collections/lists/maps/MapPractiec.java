package ru.itsjava.collections.lists.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractiec {
    public static void main(String[] args) {
        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        men.put(ivanov, "футболка");
        men.put(sidorov, "свитшот");
        men.put(javov, "свитор");

        for (Map.Entry<Man, String> pair : men.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
        for (Man keyMan : men.keySet()){
            System.out.println(keyMan + ": " + men.get(keyMan));
        }
        men.remove(ivanov);
        System.out.println("men = " + men);

        System.out.println("men.size() = " + men.size());

        men.replace(javov, "свитор", "перчатки");
        System.out.println("men.get(javov) = " + men.get(javov));

    }
}
