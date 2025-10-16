package ex_19_OOPs_Constructor;

public class Car2 {
    int year;
    String model;

    //default constructor
    Car2()
    {
        model="XXX";
        year=1990;
        System.out.println("DC");
    }

    Car2(String model_Name,int year_created)
    {
        this("i10");
        this.model=model_Name;
        this.year=year_created;
    }

    Car2(String model_Name)
    {
        this.model=model_Name;
    }
}
