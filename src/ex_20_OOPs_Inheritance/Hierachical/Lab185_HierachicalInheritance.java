package ex_20_OOPs_Inheritance.Hierachical;

public class Lab185_HierachicalInheritance {
    public static void main(String[] args) {
        Pramod p=new Pramod();
        p.Home1();
        p.home();


        Lucky l=new Lucky();
        l.home();
        l.Home2();

        Ruhiana r=new Ruhiana();
        r.home3();
        r.home();

        Father f1=new Pramod();
        Father f2=new Ruhiana();
        Father f3=new Lucky();
    }
}
