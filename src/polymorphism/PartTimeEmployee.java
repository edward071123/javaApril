package polymorphism;

// 工讀生: 時間 X 時薪
public class PartTimeEmployee extends Employee{
    private int hoursWorked;

    public PartTimeEmployee(String name, double salary, int hoursWorked) {
        super(name, salary);
        setHoursWorked(hoursWorked);
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println(getName() + "的本月薪資:" + getSalary() * getHoursWorked());
    }
}
