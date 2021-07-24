package ru.itsjava.oop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OOPPractice {
    public static void main(String[] args) {

        Telephone phone = new IPhone();
        System.out.println("phone.toString() = " + phone.toString());

        Birds bird1 = new Sparrow();
        System.out.println(bird1);

        Birds bird2 = new Сrow();
        System.out.println(bird2);

        Birds bird3 = new EmperorPenguin();
        System.out.println(bird3);

        Cables cab1 = new BBGngLS();
        System.out.println(cab1);

        Cables cab2 = new Mkesh();
        System.out.println(cab2);

        Cables cab3 = new UTP();
        System.out.println(cab3);


    }
}
