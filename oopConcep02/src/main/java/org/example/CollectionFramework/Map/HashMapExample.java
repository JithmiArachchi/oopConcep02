package org.example.CollectionFramework.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // map save details as key value pairs
        HashMap<String , Integer> hashMap = new HashMap<>();

        Map map = new HashMap();
        map.put("java",1);
        map.put("python",2);
        map.put("java",1); // avoide dupplicate
        map.put("java",4); // take last value
        System.out.println(map); // follow an order
    }
}
