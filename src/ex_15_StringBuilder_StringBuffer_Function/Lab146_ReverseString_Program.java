package ex_15_StringBuilder_StringBuffer_Function;

import java.util.Scanner;

public class Lab146_ReverseString_Program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input string, I will reverse it");
        String user_input=scanner.next();

//        StringBuffer bf=new StringBuffer(user_input);
//        bf.reverse();
//        System.out.println(bf);

        String reverse_String="";
        for (int i = user_input.length()-1; i >=0; i--) {
            reverse_String=reverse_String+user_input.charAt(i);
        }

        System.out.println(reverse_String);
    }
}
