package exam;

public class HourlyEmployee extends Employee {
    private int wage    = 0;
    private int hours   = 0;

    public HourlyEmployee(String name, String mobile, int wage, int hours) {
        super(name, mobile);
        setWage(wage);
        setHours(hours);
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        String result = "以下為Hourly員工基本資料\r\n";
        result += "姓名: " + getName() + "\r\n";
        result += "手機: " + getMobile() + "\r\n";
        return result;
    }

    @Override
    public void getTax() {
        double tax = getWage() * getHours() * 0.05;
        System.out.println("取得稅額: " + tax);
    }

    @Override
    public void earnings() {
        int earnings = getWage() * getHours();
        System.out.println("取得員工未扣稅所得: " + earnings);
    }

    @Override
    public void getPaymentAmount() {
        int earnings         = getWage() * getHours();
        double tax           = getWage() * getHours() * 0.05;
        double paymentAmount = earnings - tax;
        System.out.println("取得員工扣稅所得:" + paymentAmount);
    }

}
