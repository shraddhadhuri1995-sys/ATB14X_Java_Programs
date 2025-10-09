package ex_15_StringBuilder_StringBuffer_Function;

public class Lab142_StringBuffer {

    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Pramod");

        stringBuffer.append("dutta");
        System.out.println(stringBuffer);

        String s1="Pramod";
        s1=s1+"dutta";
        System.out.println(s1);
    }
}
