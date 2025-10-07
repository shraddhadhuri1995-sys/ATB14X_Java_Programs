package ex_13_Functions;

public class Lab126_AllTypesFunctions {
    public static void main(String[] args) {
//        - 1. Without Parameters and Without Return Type
//        - 2. Without Parameters but With Return Type
//        - 3. With Parameters and Without Return Type - **main**
//          4. With Parameters and With Return Type.

        wp_wr_greet();
        System.out.println("----------------------------");

        String msg=wop_wr_greet();
        System.out.println(msg);
        System.out.println("----------------------------");


        greet_with_details("Shraddha",30, 25000.00);
        greet_with_details("Kalyan",30, 45000.00);
        System.out.println("----------------------------");

        int sum1=sumOfTwoNumbers(4,5);
        int sum2=sumOfTwoNumbers(5,6,7);
        float sum3=sumOfTwoNumbers(10.0f,10.0f,10.0f);

        System.out.println("sum1:"+sum1);
        System.out.println("sum2:"+sum2);
        System.out.println("sum3:"+sum3);

    }

    //        - 1. Without Parameters and Without Return Type
    static void wp_wr_greet() {
        System.out.println("Type-1 function");
        System.out.println("Hi,there");
    }

    //        - 2. Without Parameters but With Return Type
    static String wop_wr_greet() {
        System.out.println("Type-1 function");
        return "How are you?";
    }

    //        - 3. With Parameters and Without Return Type
    static void greet_with_details(String name,int age,double salary) {
        System.out.println("Your name is "+name+"\nage is "+age+"\nsalary is "+salary);
    }

    //          4. With Parameters and With Return Type.
    static int sumOfTwoNumbers(int a,int b)
    {
        return a+b;
    }

    static int sumOfTwoNumbers(int a,int b, int c)
    {
        return a+b+c;
    }

    static float sumOfTwoNumbers(float a,float b,float c)
    {
        return a+b+c;
    }
}

