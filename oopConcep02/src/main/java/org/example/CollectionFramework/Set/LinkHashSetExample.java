package org.example.CollectionFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set <String> set = new LinkedHashSet();
        // avoid duplicate and maintain insertion  order
        set.add("java");
        set.add("C#");
        set.add("python");
        set.add("java");
        set.add(null);
        System.out.println(set);
    }
}
