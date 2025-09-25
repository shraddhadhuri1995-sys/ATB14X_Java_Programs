package ex_06_TernaryOperator;

public class Lab0037_TernaryOperator_EvenOddNumber {
    public static void main(String[] args) {
        int a=17;
        int b=a%2;
        String result=b==0 ?+a+"is a EvenNumber": +a+" is a OddNumber";
        System.out.println(result);
    }
}
