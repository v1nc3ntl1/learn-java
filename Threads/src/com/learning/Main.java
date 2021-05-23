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

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread");

        Thread myRunnableThread2 = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from anonymous class implementation");
            }
        });
        myRunnableThread2.start();

        // running run() doesn't start another thread in different thread.
        // instead use the start().
        Thread anotherThread2 = new AnotherThread2();
        anotherThread2.setName("Another Thread");
        anotherThread2.run();
    }
}
