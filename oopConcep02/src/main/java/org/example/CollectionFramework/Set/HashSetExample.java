package org.example.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Set set = new HashSet();
        Set <String> hss = new HashSet();

        hss.add("goLang");
        hss.add("java");
        hss.add("Python");
        hss.add(null); // allow only one null
        hss.add(null); //
        hss.add("c#");
        hss.add("java"); // not caring dupplicates , not maintain an order
        hss.add("JS");
        hss.add("ruby");

        hss.remove("ruby");
        System.out.println(hss);


    }
}
