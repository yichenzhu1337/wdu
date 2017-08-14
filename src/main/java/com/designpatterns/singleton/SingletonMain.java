package com.designpatterns.singleton;

public class SingletonMain {

    public static void main(String args[]) {
        Singleton app1 = Singleton.getInstance();
        Singleton app2 = Singleton.getInstance();
        System.out.println(app1);
        System.out.println(app2);
    }

}
