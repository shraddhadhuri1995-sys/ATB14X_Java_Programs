package ex_37_CollectionFramework.MAP;

import java.util.Hashtable;
import java.util.Map;

public class Lab289_HashTable {
    public static void main(String[] args) {
        //does not allow null key and value
        //does not allow duplicates
        //It is synchronized and slow
        Map ht=new Hashtable();
        ht.put("id",1);
        ht.put("id",2);
        ht.put("id1",3);
        //ht.put(null,9);  NullPointerException
        //ht.put("id6",null); NullPointerException

        System.out.println(ht);
    }
}
