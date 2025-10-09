package ex_15_StringBuilder_StringBuffer_Function;

public class Lab150_FirstLetterOfEachWord_Program {
    public static void main(String[] args) {
        String str="I love india";
        String []arr=str.split("\\s+");

        StringBuilder stringBuilder=new StringBuilder();
        for(String array:arr)
        {
            stringBuilder.append(array.charAt(0));
        }
        String FirstLetter=stringBuilder.toString();
        System.out.println(FirstLetter);
    }
}
