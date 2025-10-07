package ex_13_Functions;

public class Lab124_Functions {
    public static void main(String[] args) {

        non_return_type_functions();

        String name=return_String_Type_Functions();
        System.out.println(name);

    }

    static void non_return_type_functions()
    {
        System.out.println("Hi ,there,No return function!!");
    }

    static String return_String_Type_Functions()
    {
        System.out.println("Hi, there, I will return something");
        return "Shraddha";
    }

    static boolean return_boolean()
    {
        return true;
    }

    static float return_float()
    {
        return 10.0f;
    }

    static long return_long()
    {
        return 1278899l;
    }
}
