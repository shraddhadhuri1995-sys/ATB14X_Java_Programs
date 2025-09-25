package ex_05_TypeCasting;

public class Lab0057_TypeCasting_0 {
    public static void main(String[] args) {
        //implicit casting or widening casting
        byte b=10;
        int i=b; //correct syntax


        //explicit casting or narrowing casting
        int a1=300;
        byte n=(byte)a1;
        System.out.println(n);
    }
}
