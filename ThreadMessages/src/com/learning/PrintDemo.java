package com.learning;

/*
code and pasted from https://www.tutorialspoint.com/java_concurrency/concurrency_synchronization.htm
 */
public class PrintDemo {

    public void printCount() {

        try {

            for(int i = 5; i > 0; i--) {
                System.out.println("Counter   ---   "  + i );
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    ThreadDemo(String name,  PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {

        // Based on my own observation of the code
        // synchronized allow block of printCount method, hence printCount() to be finished before allowing different thread to acquire block.
        synchronized(PD) {
            PD.printCount();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class TestThread {

    public static void main(String args[]) {
        PrintDemo PD = new PrintDemo();

        ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
        ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
