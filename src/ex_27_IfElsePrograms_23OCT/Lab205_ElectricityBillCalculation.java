package ex_27_IfElsePrograms_23OCT;

import java.util.Scanner;

public class Lab205_ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter units in integer");
        int units=scanner.nextInt();
       double unitsPerRupees=0;
       double bill=0;

        if(units==100)
        {
            bill=units * 0.50;
            System.out.println("Bill:"+bill);
        }
        else if(units >= 101 && units <= 200)
        {
            bill=units * 0.75;
            System.out.println("Bill:"+bill);
        }
        else if (units >= 201 && units <= 300)
        {
            bill=units * 1.20;
            System.out.println("Bill:"+bill);
        }
        else if ( units > 300 )
        {
            bill=units * 1.50;
            System.out.println("Bill:"+bill);
        }
        else {
            System.out.println("Enter valid units in integer");
        }
    }
}
