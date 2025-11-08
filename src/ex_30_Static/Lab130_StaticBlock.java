package ex_30_Static;

public class Lab130_StaticBlock {
    public static void main(String[] args) {
        A a=new A();
        A.m1();
        System.out.println(A.a);
    }
}


class A{
    static {
        System.out.println("This is called once when class is loaded");
        System.out.println("You can write the code reading a excel,database file");
    }

    static int a=10;

    static void m1()
    {
        System.out.println("Static function");
    }
}