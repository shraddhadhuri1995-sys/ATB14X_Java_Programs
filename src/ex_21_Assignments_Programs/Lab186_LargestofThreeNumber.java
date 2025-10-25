package ex_21_Assignments_Programs;

public class Lab186_LargestofThreeNumber {
    public static void main(String[] args) {
        int a=50;
        int b=34;
        int c=90;

        if(a > b && a > c)
        {
            System.out.println("Maximum Number:"+a);
        }
        else if(b > c && b > a)
        {
            System.out.println("Maximum Number:"+b);
        }
        else {
            System.out.println("Maximum Number:"+c);

        }
    }
}
