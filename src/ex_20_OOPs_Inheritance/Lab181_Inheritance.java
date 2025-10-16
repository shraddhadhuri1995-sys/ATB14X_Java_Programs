package ex_20_OOPs_Inheritance;

public class Lab181_Inheritance {
    public static void main(String[] args) {
        Son son=new Son();
        son.BHK2();
        System.out.println(son.gold);
        son.BHK3();

        Father father=new Father();
        System.out.println(father.gold);
        father.BHK2();
        //father.BHK3();
    }
}
