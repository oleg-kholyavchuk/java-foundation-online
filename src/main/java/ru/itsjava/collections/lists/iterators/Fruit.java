package ru.itsjava.collections.lists.iterators;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.Map;

@AllArgsConstructor
@Data
public class Fruit {
    private final String title;
    private double weight;

    public static <K, V> V min8(Map<K, V> map, Comparator<V> comp) {
        return map.values().stream().min(comp).get();
    }
}
