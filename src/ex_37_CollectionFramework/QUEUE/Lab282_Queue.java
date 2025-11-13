package ex_37_CollectionFramework.QUEUE;

import java.util.PriorityQueue;

public class Lab282_Queue {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.add("Shraddha");
        pq.add("Dhuri");
        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
