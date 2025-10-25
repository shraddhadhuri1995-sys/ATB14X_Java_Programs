package ex_22_Polymorphism_MethodOverloading;

public class Lab191_Calculator {
    public static void main(String[] args) {

        calc c1=new calc();
        c1.add(3,5);
        c1.add(77.2,23.2);

    }
}

 class calc
 {
     int add(int a,int b)
     {
         return a+b;
     }


     double add(double a, double b)
     {
         return a+b;
     }

     long add(int a, long b)
     {
         return a+b;
     }
 }
