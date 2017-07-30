package com.designpatterns.iterator;

import java.util.*;
import java.util.function.Consumer;

public class BikeRepository implements Iterable<String> {

    private String bikes[];
    private int index;

    BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String largeBikes[] = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largeBikes,0, bikes.length);
            bikes = largeBikes;
            largeBikes = null;
        }

        bikes[index] = bike;
        index++;
    }

    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };

        return it;
    }
}

class BikeIterator {

}