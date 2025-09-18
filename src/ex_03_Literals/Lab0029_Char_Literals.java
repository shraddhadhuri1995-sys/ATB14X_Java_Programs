package ex_03_Literals;

public class Lab0029_Char_Literals {
    public static void main(String[] args) {
        char c1='A';

       // char c2="N"; String -> bunch of character

        char c2='B';
        char c3='_';
        char c4='@';
        char c5='9';
        char c6='<';
        char c7=')';
        char c8=' ';//blank space

        //Escape sequence
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("Shraddha Dhuri");
        System.out.println("Shraddha"+new_line+"Dhuri");
        System.out.println("Shraddha\nDhuri");
        System.out.println("Kalyan"+tab_line+"Kacharekar");
        System.out.println("Grantha"+back_space+"Kacharekar");
        System.out.println("Girija\rKacharekar");
        System.out.println("---------------------------------");

    }
}
