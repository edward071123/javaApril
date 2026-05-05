package basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 2. 建立 Scanner 物件，System.in 代表標準輸入（鍵盤）
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入您的姓名：");
        String name = sc.nextLine(); // 讀取一行字串

        System.out.print("請輸入您的年齡：");
        if (sc.hasNextInt()) {       // 檢查輸入是否為整數
            int age = sc.nextInt();  // 讀取整數
            System.out.println("哈囉 " + name + "，你明年就 " + (age + 1) + " 歲了！");
        } else {
            System.out.println("抱歉，年齡請輸入數字。");
        }

        sc.close(); // 3. 關閉資源 (良好的習慣)
    }
}
