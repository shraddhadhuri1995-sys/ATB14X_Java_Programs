package ex_35_Exception;

import java.util.Scanner;

public class Lab259_Thow_Exception1 {

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int User_Input=scanner.nextInt();
        validate_Age_for_club(User_Input);

}


static void validate_Age_for_club(int age) throws Exception {
    if (age < 25) {
        throw new Exception("Age can't be less than 25");
    } else {
        System.out.println("Enjoy clubbing!!");
    }
}
}



