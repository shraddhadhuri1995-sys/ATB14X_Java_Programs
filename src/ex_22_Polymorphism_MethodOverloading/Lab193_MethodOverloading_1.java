package ex_22_Polymorphism_MethodOverloading;

public class Lab193_MethodOverloading_1 {
    public static void main(String[] args) {
        mathOperations mo=new mathOperations();
        mo.add(4,5);
        mo.add(32.4,21.3);
        mo.add("Hello","World");

    }
}

class mathOperations{
    int add(int a,int b)
    {
        return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;
    }

    double add(double a,double b)
    {
        return a+b;
    }
    String add(String a, String b)
    {
        return a+b;
    }
}
