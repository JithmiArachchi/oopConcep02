package org.example.CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        Deque <String> stringDeque = new ArrayDeque();
        stringDeque.add("java");
        stringDeque.add("java");
        stringDeque.add("python");
        stringDeque.add("C#");
       // stringDeque.add(null);  // not allowing null values : exception will occaer
        System.out.println(stringDeque);

        stringDeque.addFirst("Start");
        stringDeque.addLast("End");
        System.out.println(stringDeque);
    }
}
