package ex_38_Exam;

public class student {
    String name;
    int rollNo;
    String section;

    public student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public void display()
    {
        System.out.print("Student:"+name+", Roll No:"+rollNo+", Section:"+section );


    }

    public static void main(String[] args) {
        student s=new student("Bob",101,"A");
        s.display();
    }

}
