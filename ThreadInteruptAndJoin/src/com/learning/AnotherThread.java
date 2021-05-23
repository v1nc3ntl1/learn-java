package com.learning;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from another thread");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "Five seconds have passed and iam wake up.");
    }
}
