package polymorphism;

public class SalesEmployee extends Employee{
    private double commissionRate; // 抽成比例

    public SalesEmployee(String name, double salary, double commissionRate) {
        super(name, salary);
        setCommissionRate(commissionRate);
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    @Override
    public void calculateSalary() {
        double reslut = getSalary() * getCommissionRate();
        reslut = reslut + getSalary();
        System.out.println(getName() + "的本月薪資:" + reslut);
    }
}
