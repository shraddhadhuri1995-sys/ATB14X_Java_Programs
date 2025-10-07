package ex_12_DoWhileLoop;

public class Lab121_GradeScaleProgram {
    public static void main(String[] args) {
        int score=75;
        char grade;
        if(score >= 90 && score <= 100)
        {
            System.out.println("Grade:A");
        }
        else if(score >= 80 && score <= 89)
        {
            System.out.println("Grade:B");
        }
        else if(score >= 70 && score <= 79)
        {
            System.out.println("Grade:C");
        }
        else if(score >= 60 && score <= 69)
        {
            System.out.println("Grade:D");
        }
        else if (score >= 0 && score <= 59)
        {
            System.out.println("Grade:F");
        }
        else {
            System.out.println("Please enter valid number from 0 to 100");
        }
    }
}
