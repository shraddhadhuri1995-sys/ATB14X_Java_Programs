package ex_35_Exception;

import java.util.Scanner;

public class Lab257_Throw_Exception {
    public static void main(String[] args) throws customException {
        Scanner sc=new Scanner(System.in);
        if(!sc.next().equalsIgnoreCase("Shraddha"))
        {
            throw new customException("Not allowed!!");
        }
    }
}
