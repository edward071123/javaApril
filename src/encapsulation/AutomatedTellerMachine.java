package encapsulation;

import java.util.Scanner;

public class AutomatedTellerMachine {
    private String account;
    private String password;
    private int deposit;
    private int withdrawErrorTimes = 1;

    public AutomatedTellerMachine() {
        this.account    = "edward";
        this.password   = "123123";
        this.deposit    = 0;
    }
    
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return this.deposit;
    }


    public void transaction() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("請輸入提領帳號");
            String inputAccount = sc.nextLine();
            System.out.println("請輸入提領密碼");
            String inputPassword = sc.nextLine();
            if (this.account.equals(inputAccount) && this.password.equals(inputPassword)) {
                break;
            } else {
                System.out.println("提領帳號或密碼錯誤 請重新輸入 (已累積錯誤:" + this.withdrawErrorTimes + ")");
            }
            this.withdrawErrorTimes++;
        }

        if (this.withdrawErrorTimes >= 3) {
            System.out.println("帳號密碼輸入錯誤已超過三次,已經被鎖卡無法提領,請洽發卡銀行");
        } else {
            boolean end = false;
            while (end == false) {
                System.out.println("請輸入要辦理項目,1:提領,2:存款,3:餘額查詢,4:結束");
                int inputType = sc.nextInt();
                if (inputType == 1) {
                    // 提領
                    System.out.println("請輸入提領金額");
                    int inputMoney      = sc.nextInt();
                    int getDepositValue = getDeposit();
                    if (getDepositValue == 0 || getDepositValue < inputMoney) {
                        System.out.println("餘額不足");
                    } else {
                        setDeposit(getDepositValue - inputMoney);
                        System.out.println("提領成功, 目前餘額: " + getDeposit());
                    }
                } else if (inputType == 2) {
                    // 存款
                    System.out.println("請輸入存款金額");
                    int inputMoney      = sc.nextInt();
                    int getDepositValue = getDeposit();
                    if (inputMoney == 0) {
                        System.out.println("交易終止, 請勿輸入不正常的金額");
                    } else {
                        setDeposit(getDepositValue + inputMoney);
                        System.out.println("存款成功, 目前餘額: " + getDeposit());
                    }
                } else if (inputType == 3) {
                    // 餘額查詢
                   System.out.println("目前餘額: " + getDeposit());
                } else if (inputType == 4) {
                    // 結束
                    System.out.println("謝謝您的使用");
                    end = true;
                } else {
                    // 其他數字
                    System.out.println("輸入錯誤");
                }
            }
            
        }

        sc.close();
    } 
}
