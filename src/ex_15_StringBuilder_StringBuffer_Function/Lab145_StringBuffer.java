package ex_15_StringBuilder_StringBuffer_Function;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Java");
        stringBuffer.append(" Programming");
        System.out.println(stringBuffer);

        stringBuffer.replace(0,4,"C++");
        System.out.println(stringBuffer);

    }
}
