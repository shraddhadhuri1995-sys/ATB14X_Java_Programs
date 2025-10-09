package ex_15_StringBuilder_StringBuffer_Function;

public class Lab148_StringPalindrome_Program {
    public static void main(String[] args) {
        String user_Input="madam";
        String reversed="";

        for (int i = user_Input.length()-1; i >=0 ; i--) {
            reversed= reversed + user_Input.charAt(i);
        }

        if(reversed.equals(user_Input))
        {
            System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
    }
}
