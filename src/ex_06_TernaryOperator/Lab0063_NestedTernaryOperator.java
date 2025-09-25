package ex_06_TernaryOperator;

public class Lab0063_NestedTernaryOperator {
    public static void main(String[] args) {
        int age=21;
        String str= ( age > 18 )? ( age > 25 )? "You can go to Goa": "Yo can go to goa but you can't drink": "no";
        System.out.println(str);
    }
}
