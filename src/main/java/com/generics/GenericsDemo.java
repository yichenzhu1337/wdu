package com.generics;

import com.collections.*;

import java.math.BigInteger;
import java.util.*;
import java.util.Collection;


/**
 * Source:
 * https://www.youtube.com/watch?v=9tHLV0u87G4&t=1510s
 * Trevor Page
 * Java Generics Tutorial
 *
 * Source #2: - real world example
 * https://www.ibm.com/developerworks/library/j-genericdao/
 * Dont repeat the DAO
 *
 * Source #3: - pluralsight
 * https://app.pluralsight.com/player?course=java-generics&author=richard-warburton&name=java-generics
 */
public class GenericsDemo {

    public static void main(String[] args) {
        // why should we use generics, cause we don't wanna cast this shit
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
        System.out.println(s);

        // see we already use it
        List<String> list2 = new ArrayList<>();
        list2.add(0, "hey0");
        //list2.add(2, "hey2");
        list2.add("hey");

        List<BoxOne> boxeOnes = new ArrayList<>();
        boxeOnes.add(new BoxOne());
        boxeOnes.add(new BoxOne());
        boxeOnes.add(new BoxOne());

        List<BoxTwo<String>> boxeTwos = new ArrayList<>();
        BoxTwo<String> b1 = new BoxTwo<>();
        b1.setObj("hi");
        b1.inspect(1222);
        //boxeTwos.add(b1);
        boxeTwos.add(new BoxTwo<>());
        boxeTwos.add(new BoxTwo<>());

        // Using Pairs
        Pair<String, Integer> pair1 = new OrderedPair<>("key", 123);
        Pair<Integer, Integer> pair2 = new OrderedPair<>(123, 123);

        sumOfNumbers(Arrays.asList(1.2, 200, 3.121212));

        List legacyRawTypeList = new ArrayList();
        legacyRawTypeList.add("asd");
        legacyRawTypeList.add(1);
        legacyRawTypeList.add(new Object());

        Iterator iterator = legacyRawTypeList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element.toString());
        }
    }

    // upper bound - usually use it as a "getter"
    public static void sumOfNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number n: numbers) {
            sum += n.doubleValue();
        }
        System.out.println(sum);
    }

    // upper bound method number 2
    public static <T extends Number> void sumOfNumbers2(List<T> numbers) {
        double sum = 0;
        for (Number n: numbers) {
            sum += n.doubleValue();
        }
        System.out.println(sum);
    }

    // lower bound - usually use it as a "setter" - "super" is very rarely used
    public static void addNumbersToList(List<? super Integer> numbers, int addedNumber) {
        numbers.add(addedNumber);
    }

    // usually ? / the wildcard is used in Collections
}