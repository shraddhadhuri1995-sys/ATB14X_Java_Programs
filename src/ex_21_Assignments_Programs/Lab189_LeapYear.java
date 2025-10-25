package ex_21_Assignments_Programs;

public class Lab189_LeapYear {
    public static void main(String[] args) {
        int year=2019;

        if((year % 400==0) || (year % 4==0 && year % 100!=0))
        {
            System.out.println("This is leap year");
        }
        else
        {
            System.out.println("This is not leap year");
        }
    }
}
