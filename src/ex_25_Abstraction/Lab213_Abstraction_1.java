package ex_25_Abstraction;

public class Lab213_Abstraction_1 {
    public static void main(String[] args) {
        alto car=new alto();
        car.drive();
    }
}

abstract class car1{
    abstract void startCar();
    abstract void stopCar();
}

class alto extends car1 implements tyre,gear,engine{

    void drive()
    {
        blackColourToDoTyre();
        rubberTyre();
        this.startCar();
        startEngine();
        changeGear();
        this.stopCar();
    }
    @Override
    void startCar() {
        System.out.println("starting the car");
    }

    @Override
    void stopCar() {
        System.out.println("stopping the car");
    }

    @Override
    public void changeGear() {
        System.out.println("changing the gear");
    }

    @Override
    public void rubberTyre() {
        System.out.println("changing rubber tyre");

    }

    @Override
    public void blackColourToDoTyre() {
        System.out.println("changing black colour tyre");
    }

    @Override
    public void startEngine() {
        System.out.println("start the engine");
    }
}

interface tyre{
    abstract void rubberTyre();
    void blackColourToDoTyre();
}

interface gear
{
    void changeGear();
}
 interface engine
 {
    void startEngine();
 }