package com.generics;

import com.collections.*;
import java.util.*;
import java.util.Collection;

public class Generics {

    private static Collection<Train> trains = new ArrayList<>();

    public static void main(String[] args) {
        trains.add(new Train("T1"));
        trains.add(new Train("T2"));
        trains.add(new Train("T3"));

        System.out.println(trains);
    }

    public static Collection<Train> getTrains() {
        return trains;
    }

}