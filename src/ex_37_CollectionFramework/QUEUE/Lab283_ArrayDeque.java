package ex_37_CollectionFramework.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab283_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<Integer>();
        d.push(1);
        d.push(7);
        d.push(9);

        System.out.println(d);
    }
}
