package com.chosensolutions.ocp.chapter3collections.queue;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        Queue<Integer> numbers1 = new LinkedList<>();
        List<Integer> numbers2 = new LinkedList<>();

        numbers1.offer(1);
        numbers2.add(1);

        System.out.println(numbers1);
        System.out.println(numbers2);
    }
}