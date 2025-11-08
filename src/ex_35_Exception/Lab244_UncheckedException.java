package ex_35_Exception;

public class Lab244_UncheckedException {
    public static void main(String[] args) {
        int a=0;
        int b= 10;
        int c=b/a;//java.lang.arithmaticException


        String name=null;
        name.trim();//java.lang.nullpointerException
    }
}
