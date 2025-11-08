package ex_35_Exception;

public class Lab243_Exception {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip=args[0]; //java.lang.ArrayIndexOutOfBoundException
        int a=Integer.parseInt(ip);
        int b=100/a; //java.lang.ArithmeticException   //java.lang.NumberFormatException
        System.out.println(b);

        System.out.println("End the program");

    }
}
