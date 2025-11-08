package ex_35_Exception;

public class Lab251_Fix_FirstProgram {
    public static void main(String[] args) {
        try {
            String ip=args[0]; //java.lang.ArrayIndexOutOfBoundException
            int a=Integer.parseInt(ip);
            int b=100/a; //java.lang.ArithmeticException   //java.lang.NumberFormatException
            System.out.println(b);
        } catch (NumberFormatException |ArithmeticException |ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem");
        } finally {
            System.out.println("I will always executed!!");
        }

    }
}
