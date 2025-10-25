package ex_23_Polymorphism_MethodOverrriding;

public class lab195_MethodOverrriding {
    public static void main(String[] args) {
  Pramod p=new Pramod();
  p.home();

  father f1=new father();
  f1.home();

  father f2=new Pramod(); //Dynamic dispatch
  f2.home();

    }
}
class father{
    void home()
    {
        System.out.println("2BHK");
    }
}

class Pramod extends father{
    void home()
    {
        System.out.println("3BHK");
    }
}
