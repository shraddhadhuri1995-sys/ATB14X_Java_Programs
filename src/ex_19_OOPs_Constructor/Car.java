package ex_19_OOPs_Constructor;

public class Car {
    String name;
    int year;
    String model;

    //default constructor
    Car()
    {
        name="unknown car";
        model="XXX";
        year=0;
        System.out.println("DC");
    }
}
