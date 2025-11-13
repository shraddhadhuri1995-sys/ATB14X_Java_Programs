package ex_37_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab277_Arraylist_class_element {
    public static void main(String[] args) {
    student s1=new student("Amit","1");
    student s2=new student("Rohit","2");
    student s3=new student("Mehak","3");

    List<student> myStudents=new ArrayList<>();
    myStudents.add(s1);
    myStudents.add(s2);
    myStudents.add(s3);

    s1.printDetails();
    s2.printDetails();
    s3.printDetails();
    }
}

class student extends Object
{
    private String name;
    private String rollNo;

    public student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails()
    {
        System.out.println("Student Name:"+this.name);
        System.out.println("Student Roll No:"+this.rollNo);
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
