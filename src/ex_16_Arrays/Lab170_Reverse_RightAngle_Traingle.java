package ex_16_Arrays;

import java.util.Scanner;

public class Lab170_Reverse_RightAngle_Traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n for pattern");

        int n=sc.nextInt();
        for (int i = n; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
