package ex_11_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab116_RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int guess_Random_number=random.nextInt(100)+1;
//        System.out.println(guess_Random_number);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int guess;
        int attempts=0;

        while(true)
        {
            if(!scanner.hasNextInt())
            {
                System.out.println("Invalid input!! Please enter the number");
                scanner.next();
                continue;
            }
            guess=scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter the number between 1 to 100");
                continue;
            }

            if(guess < guess_Random_number)
            {
                System.out.println("Too low, try again!!");
            } else if (guess > guess_Random_number) {
                System.out.println("Too High, try again!!");
            }
            else {
                System.out.println("Correct, you guessed it in "+attempts+"attempts");
                break;
            }
        }
    }
}
