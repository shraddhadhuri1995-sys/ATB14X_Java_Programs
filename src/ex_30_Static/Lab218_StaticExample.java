package ex_30_Static;

public class Lab218_StaticExample {

    public static void main(String[] args) {
        student s=new student(11);
        student s1=new student(22);

        System.out.println(s.age);
        System.out.println(s1.age);

        System.out.println(student.course_name);
    }
}

class student{
    int age;
    static String course_name="ATB";

    public student(int age_c) {
        this.age = age_c;
    }

    static void m1()
    {
        System.out.println("This is static method");
    }
}