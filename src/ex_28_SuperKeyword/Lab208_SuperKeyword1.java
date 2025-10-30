package ex_28_SuperKeyword;

public class Lab208_SuperKeyword1 {
}

class father
{
    father()
    {
        System.out.println("DC=father");
    }
    int gold=10;
  void home()
  {
      System.out.println("Father's home");
  }
}


class son extends father{
    son()
    {
    super();
    }

    int gold_c=100;
    void bike(){}

    void newHome()
    {
        System.out.println(super.gold);
        super.home();
        System.out.println(this.gold_c);
        this.newHome();
        this.bike();
    }

}