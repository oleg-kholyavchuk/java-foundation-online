package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Salary {
    private final double baseSalary;
    private static double increaseCoeficient = 2.5;
    public final static double CEO = 500_000.0;

    public double getFullSalary(){
        return baseSalary * increaseCoeficient;
    }

    public static void setIncreaseCoeficient(double increaseCoeficient1){
        increaseCoeficient = increaseCoeficient1;

    }
}
