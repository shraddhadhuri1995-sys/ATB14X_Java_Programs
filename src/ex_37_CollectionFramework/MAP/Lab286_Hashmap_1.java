package ex_37_CollectionFramework.MAP;

import java.util.HashMap;

public class Lab286_Hashmap_1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put("id",1);
        hm.put("id",2);
        hm.put("id1",3);
        hm.put(null,9);
        hm.put("id6",null);
        System.out.println(hm);

        System.out.println(hm.size());
        System.out.println(hm.containsKey("id1"));
        System.out.println(hm.containsValue(null));
        System.out.println(hm.isEmpty());

        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.get("id6"));
    }
}
