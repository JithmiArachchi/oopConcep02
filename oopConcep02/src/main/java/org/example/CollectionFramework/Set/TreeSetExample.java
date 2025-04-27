package org.example.CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        Set set = new TreeSet();
        Set<String> stringSet = new TreeSet();

        // orderd list and avoid dupplicates
        set.add("Java");
        set.add("Python");
        set.add("C#");
        set.add("Java");
       // set.add(null);
        System.out.println(set);

        Set<Integer> integers = new TreeSet();
        integers.add(1);
        integers.add(7);
        integers.add(1);
        integers.add(3);
        integers.add(2);
        System.out.println(integers);

    }
}
