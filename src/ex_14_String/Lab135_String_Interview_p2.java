package ex_14_String;

public class Lab135_String_Interview_p2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");

        //Comparison->string ->check this location reference

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);


        //equals (content)-> value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
