package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Knife {
    private final String material;
    private int price;

        @Override
    public boolean equals(Object o) {  // публичный булевский метод equals. С параметром Object o
        if (this == o) return true; // тут идет сравнение на равенство объекта "о" с ключивым словом которое ссылается на объект. Если они равны тогда true
        if (o == null || getClass() != o.getClass()) return false; // тут идет сравнения обьекта "о" с null на равенство. Или сравнение getClass на неревенство getClassa "о". Если они равны тогда возвращаем false

        Knife knife = (Knife) o; // тут вызываем класс Knife, и приравниваем к переменной knife значение значение объекта "о"

        return material.equals(knife.material); // возвращаем значение сравнения перемеммых material
    }

    @Override
    public int hashCode() { // публичный целочисленный метод hashCode
        return material.hashCode(); // возвращает переменную material со значением hashCode
    }
}
