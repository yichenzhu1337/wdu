package com.chosensolutions.ocp.chapter3collections;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        int[] arr1;
        int[] arr4 = new int[10];
        int a[] = {33, 3, 4, 5};
        int[] arr2;
        int arr3[];
        arr1 = new int[10];

        System.out.println("===== Collections & Arrays =====");

        List<String> cars = new ArrayList<>();
        Set<String> animals = new HashSet<>();
        HashMap<String, String> human = new HashMap<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        for (String car : cars) {
            System.out.println(car);
        }

        animals.add("Cheetah");
        animals.add("Leopard");
        animals.add("Jaguar");
        for (String item : animals) {
            System.out.println(item);
        }

        human.put("age", "10");
        human.put("name", "John Doe");
        human.put("height", "180cm");
        for (Map.Entry<String, String> entry : human.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}