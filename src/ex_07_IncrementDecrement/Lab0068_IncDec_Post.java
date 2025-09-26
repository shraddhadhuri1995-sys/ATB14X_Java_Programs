package ex_07_IncrementDecrement;

public class Lab0068_IncDec_Post {
    public static void main(String[] args) {
//        int a=10;
//        System.out.println(++a);

        //post increment -> first print the value and then increase

        int a_post=10;
        int b=a_post++;
        System.out.println("a_Post :"+ a_post);
        System.out.println("b:"+ b);

        //ERT table(exp and result table)
        //LN  /a_post    /b
        //10  /10        /NA
        //11  /11        /10

    }
}
