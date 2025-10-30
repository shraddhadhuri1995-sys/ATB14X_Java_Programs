package ex_27_IfElsePrograms_23OCT;

import java.util.Scanner;

public class Lab202_NumberIsPalindrome {

    public static void main(String[] args) {


    int num = 121; // Example number
    int originalNum = num;
    int reversedNum = 0;

    while (num != 0) {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num /= 10;
    }

     if (originalNum == reversedNum) {
        System.out.println(originalNum + " is a palindrome.");
    } else {
        System.out.println(originalNum + " is not a palindrome.");
    }
}
}
