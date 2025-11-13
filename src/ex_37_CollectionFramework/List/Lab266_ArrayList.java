package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab266_ArrayList {
    public static void main(String[] args) {
      List list=new ArrayList<>();
      list.add("1");
      list.add("2");
      list.add("3");
      list.add("3");
      list.add(4);
      list.add(true);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println("_______________Using For Loop_________________");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("_______________Enhanced For Loop_____________________");
        for(Object o:list)
        {
            System.out.println(o);
        }

        System.out.println("_________________Using ListIterator_________________");
        Iterator i= list.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
