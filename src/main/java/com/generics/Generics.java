package com.generics;

import com.collections.*;

import java.util.*;
import java.util.Collection;

public class Generics {

    private static Collection<Train> trains = new HashSet<>();

    public static void main(String[] args) {
        Integer[] iray = {1, 2, 3};
        Character[] cray = {'b', 'u', 'c', 'k', 'y'};

        printMe(iray);
        printMe(cray);


/*        trains.add(new Train("T1"));
        trains.add(new Train("T2"));
        trains.add(new Train("T3"));

        System.out.println(trains);

        List names = new ArrayList();
        names.add("John");
        names.add(123);
        names.add(new StringBuilder("Joel"));

        List newNames = new ArrayList<>();
        newNames.add(11);
        newNames.add(12);
        names.add(newNames);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }*/


    }

/*    public static void printMe(int[] i) {
        for(int x : i) {
            System.out.println(x);
        }
    }

    public static void printMe(char[] i) {
        for(char x : i) {
            System.out.println(x);
        }
    }*/

    // generic method
/*    public static <T> void printMe(T[] x) {
        for(T b : x) {
            System.out.println(b);
        }
    }*/

    public static <T> void printMe(T[] x) {
        for(T b : x)
            System.out.printf("%s ", b);
        System.out.println();
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c) {

        return a;
    }
}