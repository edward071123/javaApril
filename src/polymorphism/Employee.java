package polymorphism;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void calculateSalary() {
        System.out.println(getName() + "的基本月薪:" + salary);
    }
}
