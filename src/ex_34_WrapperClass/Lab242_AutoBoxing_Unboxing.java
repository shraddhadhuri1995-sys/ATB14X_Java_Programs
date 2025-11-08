package ex_34_WrapperClass;

public class Lab242_AutoBoxing_Unboxing {
    public static void main(String[] args) {
        int a=10;

        //Autoboxing (Primitive -> Wrapper)
        Integer b=a;
        System.out.println(b.intValue());
        System.out.println(a);

        //Unboxing (Wrapper -> Primitive)
        Integer aa=43;
        int a1=aa;
        System.out.println(a1);

    }



}
