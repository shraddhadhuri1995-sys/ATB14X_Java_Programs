package ex_17_IfElse_Program;

public class Lab167_Vowel_Constant {
    public static void main(String[] args) {

        String str="I";

        if(str.equalsIgnoreCase("a")|| str.equalsIgnoreCase("e")||str.equalsIgnoreCase("i")|| str.equalsIgnoreCase("o")||str.equalsIgnoreCase("u"))
        {
            System.out.println("Character is vowels");
        }
        else
        {
            System.out.println("Character is Consonant");
        }
    }
}
