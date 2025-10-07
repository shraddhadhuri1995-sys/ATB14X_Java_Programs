package ex_13_Functions;

public class Lab125_UserDefinedFunction {
    public static void main(String[] args) {
        int result=sumOfTwoNumber(3,4);
        int result1=sumOfTwoNumber(10,45);
        System.out.println(result);
        System.out.println(result1);
    }

    static int sumOfTwoNumber(int a, int b)
    {
        return a+b;
    }

    static void sumOfTwoNumber()
    {
        System.out.println("Hi,there");
    }
}
