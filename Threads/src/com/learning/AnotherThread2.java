package com.learning;

public class AnotherThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello from " + currentThread().getName());
    }
}
