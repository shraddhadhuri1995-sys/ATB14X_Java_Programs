package ex_10_ForLoop;

public class Lab106_Continue_EvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
