package ex_29_Interface;

public class Lab215_MultipleInheritance_Problem {
}

class child1 implements father1,father2{

    @Override
    public void money() {
        System.out.println("child money!!");
    }
}

interface  father1
{
    void money();
}

interface father2
{
    void money();
}
