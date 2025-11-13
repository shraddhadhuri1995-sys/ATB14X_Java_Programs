package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab274_ArrayList_Iteration {
    public static void main(String[] args) {
        List arrayList=new ArrayList();
        arrayList.add("Shraddha");
        arrayList.add("Shraddha");
        arrayList.add("dhuri");
        arrayList.add(123);
        arrayList.add(12.25);
        arrayList.add(true);


        for(Object ss:arrayList)
        {
            System.out.println(ss);
        }

        System.out.println("______________________________");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("________________________________");
        Iterator it=arrayList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
