package ex_11_WhileLoop;

import java.util.Scanner;

public class Lab115_Factorial_UsingWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number for factorial program");
        if(!scanner.hasNextInt())
        {
            System.out.println("You fool, int only");
        }
        else {
            int number= scanner.nextInt();
            int fact=1;
            if(number==0)
            {
                fact=1;
                System.out.println("Fact=1");
            }
            if (number < 0 || number > Integer.MAX_VALUE)
            {
                System.out.println("Can't get factorial as out of bound");
            }
            int i=1;
            while(i<=number)
            {
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
