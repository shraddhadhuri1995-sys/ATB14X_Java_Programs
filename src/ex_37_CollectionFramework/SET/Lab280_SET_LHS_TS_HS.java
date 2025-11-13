package ex_37_CollectionFramework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab280_SET_LHS_TS_HS {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        //Hasing mechanism to store elements
        //does not maintain order
        //no duplicates

        set.add("Apple");
        set.add("Orange");
        set.add("Orange");
        set.add("Mango");
        set.add(null);
        System.out.println(set);

        System.out.println("--------------------------------");
        Set lhs=new LinkedHashSet();
        // mechanism to store elements
        //maintain insertion order
        //no duplicate

        lhs.add("dapple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Mango");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("apple"));
        System.out.println(lhs.size());

        System.out.println("----------------------------");
        Set ts=new TreeSet();
        // Red and Black tree mechanism to store elements
        //maintain insertion order
        //natural sorting
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Watermelon");
        System.out.println(ts);


    }
}
