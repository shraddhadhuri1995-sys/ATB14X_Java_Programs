package ex_35_Exception;

public class Lab260_FinallyNotExecuted {
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.out.println("Try executed");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Cactching the Exception");
        } finally {
            System.out.println("I will be always executed");
        }
    }
}
