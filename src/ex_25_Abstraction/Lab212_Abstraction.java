package ex_25_Abstraction;

public class Lab212_Abstraction {
    public static void main(String[] args) {
        son s=new son();
        s.loan50K();
        s.loan10K();
    }

}

abstract class AmitFather{
    abstract void loan50K();

    void loan10K()
    {
        System.out.println("given");
    }
}

class son extends AmitFather{

    @Override
    void loan50K() {
        System.out.println("Ok, I am Amit, I will give father loan of 50K");
    }
}
