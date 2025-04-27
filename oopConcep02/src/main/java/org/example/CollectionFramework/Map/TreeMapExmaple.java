package org.example.CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExmaple {
    public static void main(String[] args) {
        TreeMap  map = new TreeMap();
        Map treeMap1 = new TreeMap();
        Map<String , Integer>  treeMap = new TreeMap();

        map.put("java",1);
        map.put("python",2);
        map.put("java",1);
        map.put("java",4);
        System.out.println(map);

        treeMap.put("1one",3);
        treeMap.put("4four",6);
        treeMap.put("2two",7);
        treeMap.put("1one",7);
        treeMap.put("1one",3);
        treeMap.put("8eight",7);
        treeMap.put("9nine",1);

        System.out.println(treeMap); // ordered


    }
}
