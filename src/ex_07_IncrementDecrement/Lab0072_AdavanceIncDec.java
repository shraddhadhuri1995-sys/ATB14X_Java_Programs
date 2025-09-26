package ex_07_IncrementDecrement;

public class Lab0072_AdavanceIncDec {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + ++a); //11+12=23
        System.out.println(a);//12
        //ERT
        //LN    /A->++a      /B->++
        //5     /a=10  NA    /NA
        //6     /11          /12
        //7     //a=12
    }
}
