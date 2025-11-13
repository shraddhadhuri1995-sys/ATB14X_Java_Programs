package ex_37_CollectionFramework.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab284_LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList();
        q.add(5);
        q.add(24);
        q.add(80);
        System.out.println(q);

        Iterator<Integer> it=q.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
