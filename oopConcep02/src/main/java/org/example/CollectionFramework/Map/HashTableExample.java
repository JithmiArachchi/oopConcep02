package org.example.CollectionFramework.Map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
// Creating a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(1, "Java");
        table.put(1, "Java");
        //table.put(1, null);
        //table.put(null, "null");
        //table.put(null, "Java");
        table.put(2, "Python");
        table.put(7, "Python");
        table.put(3, "C++");

        // Retrieving values
        System.out.println( table);

        // Iterating through Hashtable
        for (Integer key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }
    }
}
