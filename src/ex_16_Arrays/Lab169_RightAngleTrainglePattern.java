package ex_16_Arrays;

import java.util.Scanner;

public class Lab169_RightAngleTrainglePattern {
    public static void main(String[] args) {
        //*
        //* *
        //* * *


        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the n for the pattern");
        int n=scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
