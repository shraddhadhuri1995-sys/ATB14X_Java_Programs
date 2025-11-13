package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab273_LinkedList {
    public static void main(String[] args) {
        List al=new ArrayList<>();
        List al1=new ArrayList(5);
        List al2=List.of("12","22","78");


        List linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
    }
}
