package lessons;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapLesson {

    public List list = List.of("ddsdsds", "dsdsffsfsfs", "ds");

    public static void main(String[] args) {

        Map<Integer, String> passportAndNames = new HashMap<>();
        Map<Integer, String> passportAndNames2 = new HashMap<>();

        passportAndNames.put(2232232, "Lidiya");
        passportAndNames.put(3342232, "Ivan");
        passportAndNames.put(224332, "Donald");
        passportAndNames.put(224332, "Donaldson");

        passportAndNames2.put(22232, "Lidiya");
        passportAndNames2.put(33232, "Ivan");
        passportAndNames2.put(22332, "Donald");
        passportAndNames2.put(2232, "Donaldson");

        System.out.println("passportAndNames = " + passportAndNames);

        String aName = passportAndNames.get(3342232);
        System.out.println("aName = " + aName);

        passportAndNames.remove(224332);
        System.out.println("passportAndNames = " + passportAndNames);

        System.out.println("passportAndNames.containsKey(44445454) = " + passportAndNames.containsKey(44445454));
        System.out.println("passportAndNames.containsValue(\"Lidiya\") = " + passportAndNames.containsValue("Lidiya"));

        passportAndNames.putAll(passportAndNames2);

        System.out.println("passportAndNames = " + passportAndNames);

        for (Map.Entry map: passportAndNames.entrySet()) {
            System.out.println("map = " + map);
        }


    }

    @Override
    public String toString() {
        return "HashMapLesson{ _ }";
    }
}

