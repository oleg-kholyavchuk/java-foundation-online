package ru.itsjava.threads.lecture2;

import lombok.SneakyThrows;

public class HomePractice {
    @SneakyThrows
    public static void main(String[] args) {

        Runnable functionalRun1 = () -> System.out.println("Привет я Runnable");
        new Thread(functionalRun1).start();

        Runnable functionalRun2 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Привет я проснулся после 4 сек");
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(functionalRun2);
        thread1.start();
        thread1.join();
        System.out.println("end");

        Runnable functionalRun3 = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Привет я проснулся после 4 сек (Deamon)");
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(functionalRun3);
        thread2.setDaemon(true);
        thread2.start();
        //thread2.join();
        System.out.println("End");
    }
}
