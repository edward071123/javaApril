package encapsulation;


public class Demo {
    public static void main(String[] args) throws Exception {
        // 用封裝跟類別實作出提款機的系統
        // 需要輸入帳號密碼, 三次就要被鎖帳號
        // 還要檢查提領金額是否超過餘額
        // 存錢時需要確保金額不為0

        
        // 拆開來看:

        // AutomatedTellerMachine      atm1      =     new AutomatedTellerMachine()
        // |                            |              |
        // |                            |              +--> 放進去的值(物件)
        // |                            +-----------------> 盒子名稱 / 標籤
        // +--------------------------> 盒子型別 / 只能裝AutomatedTellerMachine

        //         盒子
        //  ____________________________________
        // / new AutomatedTellerMachine()      /|
        // /__________________________________/ |
        // |                                  | |
        // |   名稱：atm1                      | |
        // |   (AutomatedTellerMachine)       | /
        // |__________________________________|/
        AutomatedTellerMachine atm1 = new AutomatedTellerMachine();
        atm1.transaction();
    }
}
