package ex_10_ForLoop;

public class Lab105_ForLoop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
