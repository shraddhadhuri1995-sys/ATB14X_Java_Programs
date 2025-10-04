package ex_10_ForLoop;

import java.util.Scanner;

public class Lab108_FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
                int n=scanner.nextInt();
                int fact=1;
                if(n==0)
                {
                    fact=1;
                }
//        for (int i = 1; i <= n ; i++) {
//            fact= fact * i;
//        }

        for (int i = n; i >= 1 ; i--) {
            fact= fact * i;
        }
        System.out.println(fact);

    }
}
