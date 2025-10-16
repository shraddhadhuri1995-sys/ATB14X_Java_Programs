package ex_20_OOPs_Inheritance.MultiLevel;

public class Lab184_MultilevelInheritance {
    public static void main(String[] args) {
        Son pramod=new Son();
        pramod.BHK3();
        pramod.gf();
        pramod.extra();
        pramod.home();


        Father father=new Father();
        father.extra();
        father.home();
        father.gf();

        GrandFather g=new GrandFather();
        g.gf();
        g.home();

        //Dynamic dispatch
        GrandFather g1=new Son();
        Father father1=new Son();
        //not possible
//        Son s=new GrandFather();
//        Son s1=new Father();
//        Father ff=new GrandFather();

    }
}
