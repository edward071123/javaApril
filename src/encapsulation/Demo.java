package encapsulation;


public class Demo {
    public static void main(String[] args) throws Exception {
        // 用封裝跟類別實作出提款機的系統
        // 需要輸入帳號密碼, 三次就要被鎖帳號
        // 還要檢查提領金額是否超過餘額
        // 存錢時需要確保金額不為0

        AutomatedTellerMachine atm = new AutomatedTellerMachine();
        atm.transaction();
    }
}
