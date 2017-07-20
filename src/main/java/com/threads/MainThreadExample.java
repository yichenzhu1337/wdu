package com.threads;

public class MainThreadExample {

    public static void main(String args[]) {
        Thread t1 = new Thread(new Tuna("Thread 1"));
        Thread t2 = new Thread(new Tuna("Thread 2"));
        Thread t3 = new Thread(new Tuna("Thread 3"));
        Thread t4 = new Thread(new Tuna("Thread 4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
