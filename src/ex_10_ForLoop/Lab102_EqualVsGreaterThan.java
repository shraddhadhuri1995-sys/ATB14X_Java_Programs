package ex_10_ForLoop;

public class Lab102_EqualVsGreaterThan {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);  //it will print 0 to 9
        }

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i); //it will print 0 to 10
        }

        for (int i = 1; i < 10; i++) { //it will print 1 to 9
            System.out.println(i);
        }
    }
}
