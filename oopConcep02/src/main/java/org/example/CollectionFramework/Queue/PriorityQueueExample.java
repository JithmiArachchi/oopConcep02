package org.example.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        Queue priorityQueue = new PriorityQueue();

        Queue queue = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(1);
        queue.add(5);
        System.out.println(queue);
// always gives the priority for smallest value
        queue.poll();
        System.out.println(queue);
    }
}
