package ex_19_OOPs_Constructor;

public class Lab179_Constructor_RealExample {
    public static void main(String[] args)
    {
        A a1=new A();
        System.out.println(a1);
    }
}

class A
{
    A()
    {
        System.out.println("I want to read a CSV file");
        System.out.println("Open the page before loading the script");
        System.out.println("You can do anything which you can when object is created");
    }
}