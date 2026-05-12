package exam;

public class Employee extends Earning implements IPayable, IInvoice{
    private String name;
    private String mobile;

    public Employee(String name, String mobile) {
        setName(name);
        setMobile(mobile);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public void earnings() {

    }

    @Override
    public void getPaymentAmount() {

    }

    @Override
    public void getTax() {

    }

    @Override
    public String toString() {
        return "";
    }
}
