package ex_35_Exception;

public class Lab249_Try_Catch_Finally {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always executed");
        }
        System.out.println(c);
    }
}
