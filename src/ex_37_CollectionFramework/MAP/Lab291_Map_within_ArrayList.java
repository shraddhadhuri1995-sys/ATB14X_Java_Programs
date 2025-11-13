package ex_37_CollectionFramework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.*;

public class Lab291_Map_within_ArrayList {
    public static void main(String[] args) {
        Map<String,Object> student=new HashMap<String,Object>();
        student.put("Name","Sharddha");
        student.put("Phone no","97987987");
        student.put("Address","Banglore");
        System.out.println(student);

        Map<String,Object> student1=new HashMap<>();
        student1.put("Name","Grantha");
        student1.put("Phone no","97987987");
        student1.put("Address","Mumbai");
        System.out.println(student1);

        List students=new ArrayList();
        students.add(student);
        students.add(student1);
        System.out.println(students);
    }
}
