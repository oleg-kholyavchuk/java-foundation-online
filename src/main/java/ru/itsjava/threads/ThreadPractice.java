package ru.itsjava.threads;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < 2_000_000_000L; j++) {
//            }
//            System.out.println("A");
//        }

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(2000L);
//            System.out.println("A");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("B");
//        }

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //   A    A  A   A   A
        //     B   B B     B     B

        PrinterThread printerThreadA = new PrinterThread("A", 2000L);

        PrinterRunnable printerRunnable = new PrinterRunnable("B", 3000L);
        Thread threadB = new Thread(printerRunnable);

        System.out.println("start");

        printerThreadA.start();
        threadB.start();
        threadB.join();

        System.out.println("end");
    }
}
