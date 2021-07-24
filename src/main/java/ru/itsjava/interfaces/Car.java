package ru.itsjava.interfaces;

public abstract class Car {
    private String name;

    abstract void getCarMake();


    public void seatInTheCar(){
        System.out.println("So good seats!!!");
    }
}
