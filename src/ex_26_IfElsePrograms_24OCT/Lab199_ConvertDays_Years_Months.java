package ex_26_IfElsePrograms_24OCT;

import java.util.Scanner;

public class Lab199_ConvertDays_Years_Months {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter days as input");
        int TotalDays=scanner.nextInt();

        int year=0;
        int months=0;
        int days=0;

        if(TotalDays>0)
        {
            year=TotalDays/365;
            TotalDays=TotalDays%365;

            months=TotalDays/30;
            TotalDays=TotalDays%30;

            days=TotalDays;

            System.out.println(year+" years, "+months+" months, "+days+" days");

        }
        else {
            System.out.println("Days cannot be negative..Please enter valid input");
        }


    }
}
