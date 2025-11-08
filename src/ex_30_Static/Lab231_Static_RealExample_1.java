package ex_30_Static;

public class Lab231_Static_RealExample_1 {
    public static void main(String[] args) {
     Automation automation=new Automation();
        System.out.println(Automation.driver);
        Automation.driver="Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);
    }
}

class Automation{
    static String driver="Chrome";
    static String driver2;
}
