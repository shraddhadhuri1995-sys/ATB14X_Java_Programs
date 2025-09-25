package ex_06_TernaryOperator;

public class Lab0064_TernaryOperator_MaxNumber {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(Math.max(x,y));

        int max=(x > y ) ? x : y ;
        System.out.println(max);
    }
}
