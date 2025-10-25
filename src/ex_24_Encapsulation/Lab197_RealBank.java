package ex_24_Encapsulation;

public class Lab197_RealBank {
    public static void main(String[] args) {
        ICICIBank bank=new ICICIBank("Amit",1000);
        long bal=bank.getBal();
        System.out.println(bal);

        ICICIBank cashier=new ICICIBank("cash",100);
        cashier.setBal(200,true);
        System.out.println(cashier.getBal());
    }


}

class ICICIBank
{

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean IsCashier) {
        if(IsCashier)
        {
            this.bal = bal;
        }
        else {
            System.out.println("Not allowed");
        }
    }





}
