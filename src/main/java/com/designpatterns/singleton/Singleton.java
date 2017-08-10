package com.designpatterns.singleton;

import java.io.Serializable;

public final class Singleton implements Serializable {

    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // Some code
    // This method is called immediately after
    // an object of this class is deserialized
    // This method returns the singleton instance .
    protected Object readResolve() {
        return getInstance();
    }

}