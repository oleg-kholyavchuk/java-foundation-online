package ru.itsjava.threads.lecture2;

public class ThreadPractice {

    public static void main(String[] args) {
//        Runnable anonymousRunnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Привет из анонимного класса");
//            }
//        };
//        anonymousRunnable.run();
//
//        Thread thread = new Thread(anonymousRunnable);
//        thread.start();
//
//        Runnable functioneRunnable = () -> System.out.println("Привет из анонимного класса");
//        new Thread(functioneRunnable).start();

//        new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Привет из быстрого потока");
//            }
//        }).start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет после сна в 3 сек");
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //System.out.println("Привет после сна в 3 сек");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("End main thread");
    }
}

