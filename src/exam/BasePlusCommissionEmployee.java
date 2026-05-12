package exam;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    public BasePlusCommissionEmployee(String name, String moble, int grossSales, double commissionRate, int baseSalary) {
        super(name, moble, grossSales, commissionRate * 1.3, baseSalary);
    }

    @Override
    public String toString() {
        String result = "以下為BasePlusCommissionEmployee員工基本資料\r\n";
        result += "姓名: " + getName() + "\r\n";
        result += "手機: " + getMobile() + "\r\n";
        return result;
    }

}
