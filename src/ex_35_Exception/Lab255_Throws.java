package ex_35_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab255_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr=new FileReader("c://abc.txt");
    }
}
