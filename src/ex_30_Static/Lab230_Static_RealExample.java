package ex_30_Static;

public class Lab230_Static_RealExample {
    public static void main(String[] args) {

    }
}

class ATB14X{
    public static void main(String[] args) {
        System.out.println("IIB-This is called when object is created!!");
    }

    static {
        System.out.println("I will execute, when the class is loaded");
    }

    private String name;
    private String PhoneNo;

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   static String courseName="ATBX";

    void readDocuments()
    {
        System.out.println("Non-Static method");
        System.out.println(courseName);
    }

    static void doAssignment()
    {
        //System.out.println(phoneNo);
        System.out.println("Do Assignment");
    }
}
