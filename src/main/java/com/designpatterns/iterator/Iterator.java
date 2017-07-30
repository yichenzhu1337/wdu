package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class IteratorMain {

    public static void main(String args[]) {
        Set<String> names = new HashSet<>();
        //List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sally");
        names.add("Paul");
        
        Iterator<String> namesItr = names.iterator();
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            //namesItr.remove();
        }

        // uses an iterator behind the scenes
        for (String name: names) {
            System.out.println(name);
        }

        // old school way
/*        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }*/
    }

}

