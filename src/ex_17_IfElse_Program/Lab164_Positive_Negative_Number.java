package ex_17_IfElse_Program;

import java.util.Scanner;

public class Lab164_Positive_Negative_Number {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();

        if(number>=0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
