package exam;

public class PaymentSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new HourlyEmployee("A1", "0911222001", 200, 500),
            new CommissionEmployee("A2", "0911222002", 10000, 0.2, 30000),
            new SalariedEmployee("A3", "0911222003", 0, 0, 40000),
            new BasePlusCommissionEmployee("A4", "0911222004", 10000, 0.2, 30000)
        };
        
        for (int i = 0; i < employees.length; i++) {
            System.out.println("=====================================");
            System.out.println(employees[i].toString());
            employees[i].earnings();
            employees[i].getTax();
            employees[i].getPaymentAmount();
        }
    }
}
