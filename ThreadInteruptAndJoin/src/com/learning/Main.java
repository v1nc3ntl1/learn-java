package com.learning;

public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hi from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class");
            }
        }.start();

        Thread myRunnableThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from another anonymous thread");
                try {

                    // default is no timeout of waiting.
//                    anotherThread.join();
                    anotherThread.join(2000);
                    System.out.println(ThreadColor.ANSI_RED + "AnotherThread terminated or timeout, so i am running.");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED + "I could not wait after all. I was interuptted");
                }
            }
        });
        myRunnableThread.start();

        // Waking up thread
        //anotherThread.interrupt();


    }
}
