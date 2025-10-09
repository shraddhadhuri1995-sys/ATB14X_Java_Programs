package ex_15_StringBuilder_StringBuffer_Function;

public class Lab141_StringBufferVsStringBuilder {
    public static void main(String[] args) {

        //String 90%
        String a="Hello";
        String a1=new String("Hello");

        //less than<10%
        StringBuilder sb=new StringBuilder("Hello");//not thread safe
        StringBuffer sf=new StringBuffer("Hello"); //thread safe

        System.out.println(sb);
        System.out.println(sf);
        System.out.println(sb.reverse());
        System.out.println(sf.reverse());

    }
}
