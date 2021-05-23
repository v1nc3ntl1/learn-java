package com.learning;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterfaceExample {
    public static void main(String args[]) {
        PrintDemo2 PD = new PrintDemo2();

        ThreadDemo2 t1 = new ThreadDemo2("Thread - 1 ", PD);
        ThreadDemo2 t2 = new ThreadDemo2("Thread - 2 ", PD);
        ThreadDemo2 t3 = new ThreadDemo2("Thread - 3 ", PD);
        ThreadDemo2 t4 = new ThreadDemo2("Thread - 4 ", PD);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class PrintDemo2 {
    private final Lock queueLock = new ReentrantLock();

    public void print() {
        queueLock.lock();

        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf(
                    "%s printed the document successfully.\n", Thread.currentThread().getName());
            queueLock.unlock();
        }
    }
}

class ThreadDemo2 extends Thread {
    PrintDemo2  printDemo;

    ThreadDemo2(String name,  PrintDemo2 printDemo) {
        super(name);
        this.printDemo = printDemo;
    }

    @Override
    public void run() {
        System.out.printf(
                "%s starts printing a document\n", Thread.currentThread().getName());
        printDemo.print();
    }
}

