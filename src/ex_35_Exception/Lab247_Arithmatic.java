package ex_35_Exception;

public class Lab247_Arithmatic {
    public static void main(String[] args) {
        int c=0;
        int b=0;
        try {
            b=10/c;
        } catch (ArithmeticException e) {
            System.out.println("not allowed!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
