package polymorphism;

public class SalesEmployee extends Employee{
    private double commissionRate; // 抽成比例

    public SalesEmployee(String name, double salary, double commissionRate) {
        super(name, salary);
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public void calculateSalary() {
        System.out.println(getName() + "的本月薪資:" + getSalary() + (getSalary() * commissionRate));
    }
}
