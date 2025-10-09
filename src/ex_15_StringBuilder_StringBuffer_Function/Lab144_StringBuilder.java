package ex_15_StringBuilder_StringBuffer_Function;

public class Lab144_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);
    }
}
