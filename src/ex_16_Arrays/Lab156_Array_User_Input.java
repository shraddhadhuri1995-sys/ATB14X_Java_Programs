package ex_16_Arrays;

import java.util.Scanner;

public class Lab156_Array_User_Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of an array(int):");
        int size= scanner.nextInt();

        String[] number_Marks=new String[size];

        for (int i = 0; i < number_Marks.length; i++) {
            System.out.println("Enter the elements:"  +i);
            number_Marks[i]= scanner.next();
        }
        System.out.println("----------Printing Array values---------");
        for (String num:number_Marks)
        {
            System.out.println(num);
        }
    }
}
