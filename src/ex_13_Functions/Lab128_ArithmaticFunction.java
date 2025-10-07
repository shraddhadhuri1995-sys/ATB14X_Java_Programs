package ex_13_Functions;

import java.util.Scanner;

public class Lab128_ArithmaticFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=readInt(scanner,"Enter the num1");
        int b=readInt(scanner,"Enter the num2");

        System.out.println();

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);

        System.out.println("Addition:"+ result_sum);
        System.out.println("Subtraction:"+ result_sub);
        System.out.println("Multiplication:"+ result_mul);
        System.out.println("Division:"+ result_div);

    }

    static int readInt(Scanner scanner,String prompt)
    {
        System.out.println(prompt);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else {
            System.out.println("Enter the int only!!");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a,int b)
    {
        return  a+b;
    }

    static int sub(int a,int b)
    {
        return  a-b;
    }

    static int mul(int a,int b)
    {
        return  a*b;
    }

    static int div(int a,int b)throws ArithmeticException
    {
        if (b == 0) {
        throw new ArithmeticException("Divisible by 0 is not allowed");
        }
        return  a/b;
    }
}
