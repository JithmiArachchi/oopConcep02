package org.example.CollectionFramework.List;

import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        List list= new LinkedList();

        List <Integer> list1 = new LinkedList();
        // data deletation and insertion in faster than array
        list1.add(10);
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(null);
        System.out.println(list1);


    }
}
