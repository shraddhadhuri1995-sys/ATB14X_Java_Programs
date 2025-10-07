package ex_14_String;

public class Lab138_String_Function_Excmple {
    public static void main(String[] args) {
      String s="Java".substring(2);
        System.out.println(s);

        String s1="Java".substring(1,3);
        System.out.println(s1);

        char arr[]="Java".toCharArray();
        System.out.println(arr);

        String st="java  ".trim();
        System.out.println(st);

        boolean b="  ".isEmpty();
        System.out.println(b);

        String s2="ab".repeat(3);
        System.out.println(s2);

        boolean b1="JAVA".equalsIgnoreCase("java");
        System.out.println(b1);

        long count="a\nn\nc".lines().count();
        System.out.println(count);
    }
}
