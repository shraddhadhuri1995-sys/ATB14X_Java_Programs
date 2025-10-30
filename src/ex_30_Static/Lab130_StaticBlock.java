package ex_30_Static;

public class Lab130_StaticBlock {
}


class A{
    static {
        System.out.println("called only once when class is loaded");
        System.out.println("you can write a code from excel file,database file");
    }
}