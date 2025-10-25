package ex_24_Encapsulation;

public class Lab196_EncapsulationDemo {

    public static void main(String[] args) {

        VMOLogin login1=new VMOLogin("admin1","password12");
        System.out.println(login1.username1);
        login1.password1="password";
        System.out.println(login1.password1);

        goodVMOLogin login=new goodVMOLogin("admin","password123");
        String pass=login.getPassword();
        System.out.println(pass);
        login.setPassword("password12",true);
        System.out.println(pass);
    }
}
class VMOLogin {
    public String username1;
    public String password1;

    VMOLogin(String username1, String password1) {
        this.username1 = username1;
        this.password1 = password1;
    }
}
class goodVMOLogin
{
    private String username;
    private String password;

    goodVMOLogin(String username,String password)
    {
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean IsGoodAdmin) {
        if(IsGoodAdmin)
        {
            this.password = password;
        }
        else {
            System.out.println("not alllowed");
        }
    }

}


