package ex_10_ForLoop;

public class Lab104_ForLoop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
           // System.out.println(i);  it will print 0 to 5
            if(i==5)
            {
                break;
            }
            System.out.println(i);   //it will print 0 to 4
        }
    }
}
