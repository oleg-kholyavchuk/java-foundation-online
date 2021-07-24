package ru.itsjava.interfaces;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Gin implements Creatable{

    @Override
    public void createWish() {
        System.out.println("Слушаюсь и повинуюсь");
    }
}
