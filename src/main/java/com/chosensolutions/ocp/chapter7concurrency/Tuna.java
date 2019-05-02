package com.chosensolutions.ocp.chapter7concurrency;

import java.util.*;

public class Tuna implements Runnable {

    private String name;
    private int time;
    private Random r = new Random();

    public Tuna(String name) {
        this.name = name;
        this.time = r.nextInt(999);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}