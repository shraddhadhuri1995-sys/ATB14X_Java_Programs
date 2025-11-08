package ex_35_Exception;

public class Lab253_InterviewQuestion {
    public static void main(String[] args) {
        final  double pi=3.14;
        int a=0;
        try {
            int x=10/a;
        } catch (Exception e) {
            System.out.println("Div by 0");
        } finally {
            System.out.println("I will always executed anyhow");
        }
    }
}
