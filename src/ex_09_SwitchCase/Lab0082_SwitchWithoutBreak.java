package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab0082_SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day to 1 to 7");

        if(sc.hasNext())
        {
            int day= sc.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("Mon");

                case 2:
                    System.out.println("Tue");

                case 3:
                    System.out.println("Wed");

                case 4:
                    System.out.println("Thurs");

                case 5:
                    System.out.println("Fri");

                case 6:
                    System.out.println("Sat");

                case 7:
                    System.out.println("Sun");

                default:
                    System.out.println("Enter int number from 1 to 7 only");
            }
        }
        else {
            System.out.println("Enter int you FOOL!!");
        }
    }
    }

