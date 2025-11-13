package ex_37_CollectionFramework.SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab281_TreeSet {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet();
        set.add(4);
        set.add(9);
        set.add(2);
        System.out.println(set);

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
