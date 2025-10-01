package ex_08_IfCondition;

public class Lab0074_If {
    public static void main(String[] args) {
        String user_input=args[0];
        int age=Integer.parseInt(user_input);

        if(age > 18)
        {
            System.out.println("you can vote!");
        }
        else
        {
            System.out.println("you can't vote");
        }
    }
}
