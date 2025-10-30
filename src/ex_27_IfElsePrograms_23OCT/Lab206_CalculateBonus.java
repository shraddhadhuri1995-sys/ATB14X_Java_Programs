package ex_27_IfElsePrograms_23OCT;

import java.util.Scanner;

public class Lab206_CalculateBonus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter salary in double");
        double salary=scanner.nextDouble();
        System.out.println("Enter year of experience in double");
        double experienceInYear= scanner.nextDouble();
        double bonus=1;

        if(experienceInYear> 0 && experienceInYear < 1)
        {
            System.out.println("No Bonus");
        }
        else if (experienceInYear >=1 && experienceInYear <=3)
        {
            bonus=(salary * 5)/100;
            bonus=salary+bonus;
            System.out.println("Bonus is 5% of the salary: " + bonus );
        }
        else if (experienceInYear >= 4 && experienceInYear <= 6)
        {
            bonus=(salary * 10)/100;
            bonus=salary+bonus;
            System.out.println("Bonus is 10% of the salary : " + bonus );
        }
        else if (experienceInYear > 6)
        {
            bonus=(salary * 15)/100;
            bonus=salary+bonus;
            System.out.println("Bonus is 15% of the salary: " + bonus );
        }
        else
        {
            System.out.println("enter valid years of experience");
        }
    }
}
