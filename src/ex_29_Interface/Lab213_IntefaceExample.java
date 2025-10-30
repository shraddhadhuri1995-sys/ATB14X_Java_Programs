package ex_29_Interface;

public class Lab213_IntefaceExample {

    public static void main(String[] args) {
        car2 c2=new car2();
        c2.drive();
    }
}

class car2 implements brake,engine1{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();

    }

    @Override
    public void applyBreak() {
        System.out.println("applying the break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop the engine");
    }
}

interface brake{
    void applyBreak();
}

interface engine1{
    void startEngine();
    void stopEngine();

    default void testEngine()
    {
        System.out.println("Concreate complete");
    }

    default void testEngine1()
    {
        System.out.println("Concreate complete1");
    }

    default void testEngine2()
    {
        System.out.println("Concreate complete2");
    }
}