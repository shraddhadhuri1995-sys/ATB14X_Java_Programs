package ex_15_StringBuilder_StringBuffer_Function;

public class Lab140_String_Function {

    public static void main(String[] args) {
        String name="Sonal";
        //length of the string
        System.out.println(name.length());

        //charAt()
        System.out.println(name.charAt(3));

        //System.out.println(name.charAt(10)); StringIndexOutOfBoundsException: Index 10 out of bounds for length 5

        //concat()
        System.out.println(name.concat("Patel"));

        //contains()
        System.out.println(name.contains("om"));

        //.equals()
        System.out.println(name.equals("Sonal"));

        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("Sonal"));

        //indexOf
        System.out.println(name.indexOf('o'));

        //replace()
        System.out.println(name.replace('n','N'));

        //substring()
        System.out.println(name.substring(1,3));

        //toLowerCase()
        System.out.println("SONAL".toLowerCase());

        //toUpperCase()
        System.out.println("sonal".toUpperCase());

        //startsWith()
        System.out.println(name.startsWith("S"));

        //endsWith()
        System.out.println(name.endsWith("a"));

        //trim()
        System.out.println("   sonal harish   ".trim());

        //compareTo()
        System.out.println("name".compareTo("Sonal"));

        String s1="madam";
        //returns first occurance of string
        System.out.println(s1.indexOf("m"));

        System.out.println("___________________________________________________________");


        StringBuilder stringBuilder=new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb=new StringBuilder("HI");
        System.out.println(sb.toString());


    }
}
