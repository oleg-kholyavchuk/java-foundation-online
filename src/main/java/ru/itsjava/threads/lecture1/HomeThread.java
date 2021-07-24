package ru.itsjava.threads.lecture1;

import java.util.Scanner;

public class HomeThread {

    public static void main(String[] args) throws InterruptedException {

        Scanner temp = new Scanner(System.in);
        String messange1 = temp.next();
        String messange2 = temp.next();
        System.out.println(messange1);
        System.out.println(messange2);

        PrinterThread printerThreadA = new PrinterThread(messange1, 5000L);

        PrinterRunnable printerRunnable = new PrinterRunnable(messange2, 10000L);
        Thread threadB = new Thread(printerRunnable);

        System.out.println("start");

        printerThreadA.start();
        threadB.start();
        threadB.join();

        System.out.println("end");
    }
}
