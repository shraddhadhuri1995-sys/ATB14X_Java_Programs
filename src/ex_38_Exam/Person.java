package ex_38_Exam;

public class Person {

    String name;
    int age;

    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public void display()
    {
        System.out.print("Name:"+name+", Age:"+age +", ");

    }

    public static void main(String[] args) {
       Person p=new Person("John",25);
       Person p1=new Person("Alice",30);
        p.display();
        p1.display();

    }
}
