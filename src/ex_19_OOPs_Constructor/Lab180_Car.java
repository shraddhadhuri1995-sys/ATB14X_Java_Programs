package ex_19_OOPs_Constructor;

public class Lab180_Car {
    public static void main(String[] args) {
        LoginPage lp=new LoginPage();

        Car tesla=new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);
    }
}
