package ex_37_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab265_List {
    public static void main(String[] args) {
    List fruits=List.of("Orange","Banana","Guava","Apple");
        System.out.println(fruits);


        List arrayList=new ArrayList();
        arrayList.add("Shraddha");
        arrayList.add("Shraddha");
        arrayList.add("dhuri");
        arrayList.add(123);
        arrayList.add(12.25);
        arrayList.add(true);

        System.out.println(arrayList);

        System.out.println(arrayList.size());
    }
}
