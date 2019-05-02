package com.chosensolutions.ocp.chapter7concurrency;

import java.lang.management.ManagementFactory;
import java.util.Timer;
import java.util.TimerTask;

public class Example {

    public void being() {
        Thread t1 = new Thread(new Tuna("Thread 1"));
        Thread t2 = new Thread(new Tuna("Thread 2"));
        Thread t3 = new Thread(new Tuna("Thread 3"));
        Thread t4 = new Thread(new Tuna("Thread 4"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        int delay = 5000;   // delay for 5 sec.
        int interval = 1000;  // iterate every sec.
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("Hi adasd asda sd asdas das ");

                for(int i = 0; i < 10; i ++) {
                    System.out.println(i);
                }
            }
        }, delay, interval);

        System.out.println(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
    }
}
