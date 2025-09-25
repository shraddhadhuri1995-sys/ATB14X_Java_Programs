package ex_06_TernaryOperator;

public class Lab0039_TernaryOperator_AgeClassification {
    public static void main(String[] args) {
        String UserInput=args[0];
        System.out.println(UserInput);

        int age=Integer.parseInt(UserInput);
        String result= ( age < 18 )? "Minor" : ( age <= 60 )? "Adult" : "SrCitizen";
        System.out.println(result);

    }
}
