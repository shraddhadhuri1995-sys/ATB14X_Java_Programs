package ex_37_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab270_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<String>();
        fruits.add("Guava");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("pineapple");
        fruits.add("Custardapple");
        System.out.println(fruits);


        List<String> vegetables=new ArrayList<String>();
        vegetables.add("Tomato");
        vegetables.add("Potato");
        vegetables.add("Mirchi");
        vegetables.add("Beans");
        System.out.println(vegetables);

        List<String> animals=new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Monkey");
        animals.add("Donkey");
        System.out.println(animals);

        List allList=new ArrayList();
        allList.add(fruits);
        allList.add(vegetables);
        allList.add(animals);

        System.out.println(allList);
        System.out.println(allList.size());
        System.out.println(allList.get(2));
    }
}
