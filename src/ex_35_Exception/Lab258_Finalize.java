package ex_35_Exception;

public class Lab258_Finalize {
    public static void main(String[] args) {
     Lab258_Finalize lb=new Lab258_Finalize();
     lb=null;
     System.gc();
        System.out.println("main method");

        }
    public void finalize(){
        System.out.println("Finalize method called before gc");
    }
}
