package ex_26_IfElsePrograms_24OCT;

public class Lab198_NumberDivisibleBy5_11 {
    public static void main(String[] args) {
        int number=55;

        if((number % 5 ==0) && (number % 11 ==0))
        {
            System.out.println("Number is divisible by 5 & 11");
        }
        else {
            System.out.println("Number is not divisible by 5 & 11");
        }
    }
}
