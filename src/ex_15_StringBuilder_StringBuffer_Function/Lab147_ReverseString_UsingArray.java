package ex_15_StringBuilder_StringBuffer_Function;

import java.util.Scanner;

public class Lab147_ReverseString_UsingArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string, I will reverse it");
        String user_input=scanner.next();

        char arr[]=user_input.toCharArray();

        String reverse_String="";
        for (int i = arr.length-1; i >=0; i--) {
            reverse_String=reverse_String + arr[i];
        }

        System.out.println(reverse_String);
    }
}
