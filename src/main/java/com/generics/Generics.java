package com.generics;

import com.collections.*;

import java.util.*;
import java.util.Collection;

public class Generics {

    private static Collection<Train> trains = new ArrayList<Train>();

    public static void main(String[] args) {
        print();
    }

    static void print() {
        System.out.println(getTrains());
    }

    public static Collection<Train> getTrains() {
        trains.add(new Train("T1"));

        return trains;
    }
}