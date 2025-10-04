package ex_10_ForLoop;

public class Lab103_Even_ODD_NumberFrom_Top50 {
    public static void main(String[] args) {
        //even number
        for (int i = 1; i <=50 ; i++) {
            if( i%2 == 0)
            {
                System.out.println("Even Number: "+i);
            }
        }

        System.out.println("______________________________________________________");
        //odd number
        for (int i = 1; i <=50 ; i++) {
            if( i%2 != 0)
            {
                System.out.println("Odd Number: "+i);
            }
        }
    }
}
