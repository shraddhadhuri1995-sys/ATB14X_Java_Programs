package ex_19_OOPs_Constructor;

public class Lab178_OOPs_1 {
    public static void main(String[] args) {
    baby b1=new baby();
    new baby();
    new baby();
    baby b2=new baby();
    System.out.println(b2.name);
    }
}

class baby{
    String name;


    baby()
    {
        System.out.println("I am called , object is created");
    }
}
