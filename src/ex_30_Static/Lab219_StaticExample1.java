package ex_30_Static;

public class Lab219_StaticExample1 {
}


class ATB{
    int phone_no;
    String name;

    static String courseName="ATB";

    static void markAttendance(){
        System.out.println("mark attendance");
    }

    void display(){
        System.out.println(this.phone_no+this.name+courseName);
    }
}