package ex_22_Polymorphism_MethodOverloading;

public class Lab194_MethodOverloading_2 {
    public static void main(String[] args) {
        Home h1=new Home();
        h1.Task();
        h1.Task("Fan Cleaning");
    }

}


class Home{
    void Task()
    {
        System.out.println("Task cleaning Fan");
    }

    void Task(String WhichTask)
    {
        System.out.println("Task"+ WhichTask);
    }
}
