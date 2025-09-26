package ex_07_IncrementDecrement;

public class Lab0071_AdvanceIncDec {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a); //10+12=22
        System.out.println(a); //12

        //ERT
        // LN   /A->a++     /B->++a
        // 5   /10         /NA
        // 6   /10  11     /12

    }
}
