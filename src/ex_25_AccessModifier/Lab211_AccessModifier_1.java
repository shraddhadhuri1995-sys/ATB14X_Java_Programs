package ex_25_AccessModifier;

public class Lab211_AccessModifier_1 {
}


class XYZ
{
    XYZ()
    {
    }

    protected int gold=10;
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.gold);
    }
}
