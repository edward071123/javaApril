package exam;

public class SalariedEmployee extends Employee{
    private int grossSales = 0;
    private double commissionRate = 0.00;
    private int baseSalary = 0;

    public SalariedEmployee (String name, String moble, int grossSales, double commissionRate, int baseSalary) {
        super(name, moble);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
        setBaseSalary(baseSalary);
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        String result = "以下為Salaried員工基本資料\r\n";
        result += "姓名: " + getName() + "\r\n";
        result += "手機: " + getMobile() + "\r\n";
        return result;
    }

    @Override
    public void getTax() {
        double tax = (getGrossSales() * getCommissionRate() + getBaseSalary()) * 0.05;
        System.out.println("取得稅額: " + tax);
    }

    @Override
    public void earnings() {
        double earnings = getGrossSales() * getCommissionRate() + getBaseSalary();
        System.out.println("取得員工未扣稅所得: " + earnings);
    }

    @Override
    public void getPaymentAmount() {
        double earnings = getGrossSales() * getCommissionRate() + getBaseSalary();
        double tax = (getGrossSales() * getCommissionRate() + getBaseSalary()) * 0.05;
        double paymentAmount = earnings - tax;
        System.out.println("取得員工扣稅所得:" + paymentAmount);
    }
}
