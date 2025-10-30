package ex_28_SuperKeyword;

public class Lab209 {
}

class vehicle{
public int maxSpeed=180;


void noTest()
{
    System.out.println("Empty!!");
}

vehicle()
{
    System.out.println("Default Constructor");
}

vehicle(int a){
    System.out.println("Param constructor");
}

vehicle(int a,int b){
    System.out.println("Parameterized constructor");
}

void message()
{
    System.out.println("No return, No argument");
}

void message(int a){
    System.out.println("PC-argument");
}

}
