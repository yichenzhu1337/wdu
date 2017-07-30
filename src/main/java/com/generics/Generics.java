package com.generics;

import com.collections.*;
import java.util.*;
import java.util.Collection;

public class Generics {

    private static Collection<Train> trains = new HashSet<>();

    public static void main(String[] args) {
        trains.add(new Train("T1"));
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
        }
    }

    public static Collection<Train> getTrains() {
        return trains;
    }

}