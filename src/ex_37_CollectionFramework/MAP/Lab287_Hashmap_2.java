package ex_37_CollectionFramework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab287_Hashmap_2 {
    public static void main(String[] args) {
        Map<String,Object> student=new HashMap<String,Object>();
        student.put("Name","Sharddha");
        student.put("Phone no","97987987");
        student.put("Address","Banglore");
        System.out.println(student);

        Map<String,Object> student1=new LinkedHashMap<>();
        student1.put("Name","Grantha");
        student1.put("Phone no","97987987");
        student1.put("Address","Mumbai");
        System.out.println(student1);

        Map<String,Object> student3=new TreeMap<>();
        student3.put("Name","Kalyan");
        student3.put("Phone no","97987987");
        student3.put("Address","vashi");
        System.out.println(student3);


    }
}
