package ex_35_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab254_InterviewQuestion {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("c://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
