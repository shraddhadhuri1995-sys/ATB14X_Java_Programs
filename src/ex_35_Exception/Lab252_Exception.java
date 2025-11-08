package ex_35_Exception;

public class Lab252_Exception {
    public static void main(String[] args) {
        try {
            String ip=args[0]; //java.lang.ArrayIndexOutOfBoundException
            int a=Integer.parseInt(ip);
            int b=100/a; //java.lang.ArithmeticException   //java.lang.NumberFormatException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
