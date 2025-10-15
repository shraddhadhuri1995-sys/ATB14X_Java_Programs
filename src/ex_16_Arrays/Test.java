package ex_16_Arrays;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter string");
        String ss=scanner.next();
        double b=scanner.nextDouble();
        int a=scanner.nextInt();
        scanner.close();


        System.out.println("String: "+ss);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);

    }

}
