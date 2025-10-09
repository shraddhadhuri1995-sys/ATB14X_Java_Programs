package ex_15_StringBuilder_StringBuffer_Function;

import java.util.Arrays;

public class Lab149_CountNumberOfWords_program {
    public static void main(String[] args) {
        //count the number of words in the string

        String str="I am leaning Java";
        String []str1= str.split("\\s+");
        System.out.println("Total number of words :"+ str1.length);
    }
}
