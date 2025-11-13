package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab271_ListSorting {
    public static void main(String[] args) {
        List ll=new ArrayList<>();
        ll.add(91);
        ll.add(20);
        ll.add(54);
        ll.add(54);
        ll.add(100);

        System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);

        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);
    }
}
