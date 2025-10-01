package ex_09_SwitchCase;

public class Lab0085_InterviewQ {
    public static void main(String[] args) {
        char ch= 'A';
        switch (ch)
        {
            case 65:
                System.out.println("match ASCII");
                break;

            default:
                System.out.println("no match");
        }
    }
}
