package ex_37_CollectionFramework.List;

import java.util.Vector;

public class Lab268_Vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Shraddha");
        v.add("Shraddha");
        v.add("1");
        System.out.println(v);
        v.add("aamit");
        System.out.println(v);
        System.out.println(v.contains("aamit"));
        v.remove("Shraddha");
        System.out.println(v);
    }
}
