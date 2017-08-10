package com.designpatterns.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterMain {

    public static void main(String args[]) {
        Integer arrayOfInts[] = {1, 2, 3};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts); // adapted out integer array into a list

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
