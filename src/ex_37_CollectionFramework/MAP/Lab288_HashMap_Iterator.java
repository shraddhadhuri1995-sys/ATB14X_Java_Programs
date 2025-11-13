package ex_37_CollectionFramework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab288_HashMap_Iterator {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap();
        hm.put("id",1);
        hm.put("id",2);
        hm.put("id1",3);
        hm.put(null,9);
        hm.put("id6",null);

        for(Map.Entry<String,Integer> m1:hm.entrySet())
        {
            System.out.println(m1.getKey()+"->"+m1.getValue());
        }
    }
}
