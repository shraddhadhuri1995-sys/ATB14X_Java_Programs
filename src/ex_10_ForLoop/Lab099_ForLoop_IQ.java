package ex_10_ForLoop;

public class Lab099_ForLoop_IQ {
    public static void main(String[] args) {
        //long & float is possible, but we cannot use in real life.
        // increment and decrement happen in int
        for (long i = 1l; i < 10 ; i++)
        {
            System.out.println(i);
        }

        for(float f=0.0f ; f <10.79 ; f++)
        {
            System.out.println(f);
        }
    }
}
