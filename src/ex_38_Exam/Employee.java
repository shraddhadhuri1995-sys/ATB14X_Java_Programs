package ex_38_Exam;

public class Employee {
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private int id;
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp=new Employee(1,"John Doe",5000.0);
        System.out.println("Employee Id: "+emp.id+"  Employee Name: "+emp.getName()+"  Employee Salary: "+emp.getSalary());
    }

}
