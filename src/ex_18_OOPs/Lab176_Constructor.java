package ex_18_OOPs;

import java.sql.SQLOutput;

public class Lab176_Constructor {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student("Shraddha");
    }
}


class student
{
    String name;

    student()
    {
        System.out.println("Hi, I am called");
    }

    student(String name)
    {
        System.out.println("Hi ," + name);
    }

    void sleep(){}

}
