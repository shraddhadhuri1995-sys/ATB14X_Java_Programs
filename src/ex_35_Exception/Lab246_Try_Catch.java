package ex_35_Exception;

public class Lab246_Try_Catch {
    public static void main(String[] args) {
        String s1=null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error,trim is not allowed for the null");
        }
        //unchecked null pointer
    }
}
