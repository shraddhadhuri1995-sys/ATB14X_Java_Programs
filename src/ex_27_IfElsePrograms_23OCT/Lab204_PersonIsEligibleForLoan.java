package ex_27_IfElsePrograms_23OCT;

import java.util.Scanner;

public class Lab204_PersonIsEligibleForLoan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Age in integer");
        int age=scanner.nextInt();
        System.out.println("Enter salary in double or float");
        double salary=scanner.nextDouble();
        System.out.println("Enter credit card score in number");
        int creditScore=scanner.nextInt();


        if(age >= 18 && age <=80 )
        {
            if(salary >=30000)
            {
                if(creditScore >=650 && creditScore<=850)
                {
                    System.out.println("This person is eligible for the loan");
                }
                else {
                    System.out.println("Low credit score and not eligible for loan");
                }
            }
            else {
                System.out.println("low salary and not eligible for loan");
            }
        }
        else {
            System.out.println("This person is not eligible for the loan");
        }

    }
}
