package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Boy implements Comparable<Boy> {
    private final String name;
    private final int age;
    private double high;


    @Override
    public int compareTo(Boy boy) {
        return (int) (high - boy.high);
    }
}
