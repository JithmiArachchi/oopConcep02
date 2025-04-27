package org.example.CollectionFramework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap hashMap = new LinkedHashMap();

        Map <String, String> map = new HashMap();
        map.put("name", "jithmi");
        map.put("address","kalaniya");
        map.put("name", "jithmi"); // avoid duplicate
        System.out.println(map); // follow an insertion order
    }
}
