package ex_04_Operators;

public class Lab0041_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        String FirstName="Shraddha";
        String LastName="Dhuri";

        System.out.println(FirstName+LastName+a+b);
        System.out.println(a+b+FirstName+LastName);
        System.out.println(FirstName+LastName+(a+b));
    }
}
