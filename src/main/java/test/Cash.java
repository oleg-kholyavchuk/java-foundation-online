package test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class Cash<K, V> {
    private final Map<K, V> map = new ConcurrentHashMap();

    public synchronized void put(K key, V value){
        map.put(key, value);
    }

    public  V get(K key){
       return map.get(key);
    }
}

