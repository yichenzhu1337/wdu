package com.collections;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
        System.out.println("===== Generics =====");

        List<String> cars = new ArrayList<String>();
        List<String> phones = new LinkedList<String>();
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new TreeSet<String>();

        Queue<String> queue = new PriorityQueue<String>();
        //LinkedList<String> deque = new Deque<String>();


        HashMap<String, String> new_cars = new HashMap<String, String>();


        set1.add("1");
        set1.add("2");
        set1.add("2");
        set1.add("3");

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");

        for (String car: cars) {
            System.out.println(car);
        }

        System.out.println(set1.size());
        for (String item: set1) {
            System.out.println(item);
        }
    }
}