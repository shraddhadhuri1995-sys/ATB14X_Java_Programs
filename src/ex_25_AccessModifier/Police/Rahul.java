package ex_25_AccessModifier.Police;

public class Rahul extends Cop{
    public Rahul(int gun) {
        super(gun);
    }

    public static void main(String[] args) {
        Cop c=new Cop(10);
        c.defaultFunc();
        c.canIShoot();

    }


}
