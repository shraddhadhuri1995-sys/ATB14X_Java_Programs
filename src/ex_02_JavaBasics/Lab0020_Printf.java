package ex_02_JavaBasics;

public class Lab0020_Printf {
    public static void main(String[] args) {
        int a=10;
        int b=20;

      /*  System.out.println(a);
        System.out.println(b);*/

        /*System.out.print(a);
        System.out.print(b);*/

        System.out.printf("Your value of a=%d",a);
        System.out.println();
        System.out.printf("Your value of a=%d",b);

        //%d-> int,short,byte,long
        //%s->string
        //%f->float,double
        //%b->boolean

    }
}
