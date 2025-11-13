package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab269_ListRevision {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("Cheese");
        l.add("butter");
        l.add("paneer");
        l.add("jam");
        l.add(123);
        l.add(true);

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains(123));

        System.out.println("------------Using Iterator------------");
        Iterator it=l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("-----------For Loop--------------------");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));

        }

        System.out.println("-------------For Each Loop---------------");
        for (Object o:l)
        {
            System.out.println(o);
        }
    }
}
