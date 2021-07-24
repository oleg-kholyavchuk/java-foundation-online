package ru.itsjava.threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterThread extends Thread {
    private final String message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            Thread.sleep(delay);
            System.out.print(message + " ");
        }
    }
}
