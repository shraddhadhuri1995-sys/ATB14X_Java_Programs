package ex_25_AccessModifier.Police;

public class Cop {

    public int gun;
    private  String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }
 protected void canIShoot()
 {
     System.out.println("Yes!! You can");
 }

  void defaultFunc()
 {
     System.out.println("Hi !! COP");
 }
}
