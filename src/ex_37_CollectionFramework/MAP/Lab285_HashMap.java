package ex_37_CollectionFramework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab285_HashMap {
    public static void main(String[] args) {
        Map map=new HashMap<>();
        map.put("Name","Pramod");
        map.put("Roll No",2);
        map.put("Phone No",98775787);
        System.out.println(map);

        Map map1=new LinkedHashMap();
        map1.put("Name","Pramod");
        map1.put("Roll No",2);
        map1.put("Phone No",98775787);
        System.out.println(map1);

        Map map2=new TreeMap();
        map2.put("Name","Pramod");
        map2.put("Roll No",2);
        map2.put("Phone No",98775787);
        System.out.println(map2);


    }
}
