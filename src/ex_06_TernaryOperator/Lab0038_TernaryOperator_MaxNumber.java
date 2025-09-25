package ex_06_TernaryOperator;

public class Lab0038_TernaryOperator_MaxNumber {
    public static void main(String[] args) {
   int n1=9, n2=40, n3=89;

   int MaxNumber= (n1 > n2)? (n2 > n3)? n2 : n3 : (n1 > n3) ? n1: n3;
        System.out.println(MaxNumber);


    }
}
