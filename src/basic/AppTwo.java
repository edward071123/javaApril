package basic;
// class(類別)名稱要跟檔名一樣且第一個字要大寫
// 類別內容由大括號包起來
// 記得縮排
public class AppTwo {
    // 程式進入點
    // 其他方法不要跟main同名稱
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World1!");

        // System.out.println("Hello, World2!");

        // System.out.println("Hello, World31!");

        // for ( int i = 1; i <= 10; i++ ) {
        //     System.out.println("第 " + i + " 輛汽車已完成");
        // }

        // for ( int j = 1; j <= 20; j++ ) {
        //     System.out.println("hello world " + j + " 次");
        // }

        /* 基本型別介紹
         * int:     整數, 範圍: -2,147,483,648 ~ 2,147,483,647
         *
         * byte:    整數, 範圍: -128 ~ 127
         *
         * long:    整數, 範圍: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
         *
         * float:   32位元浮點數, 需要加上F
         *
         * double:  64位元浮點數, 預設型別
         *
         * char:    字元, 1個字元, 單引號
         *
         * String:  文字, 多個字元, 雙引號
         *
         * boolean: 布林, true/false
         */

        // int age = 25;
        // System.out.println(age);

        // float weight1 = 49.4F;
        // System.out.println(weight1);

        // double weight2 = 49.49;
        // System.out.println(weight2);

        // char c1 = 'a';
        // System.out.println(c1);

        // String name = "Edward";
        // System.out.println(name);

        // boolean isStudent = false;
        // System.out.println(isStudent);

        // //  溢位（Overflow）
        // byte b1 = 127;
        // b1++;  // b1 = b1 + 1;
        // System.out.println(b1);

        //... → -2 → -1 → 0 → 1 → ... → 126 → 127
        //                                    ↓
        //                                  -128

        /*
         * 陣列(Array)宣告
         * 陣列的長度是固定的, 不能改變
         * 陣列的長度是從0開始計算
         */

        // int[] bingo = {7, 22, 89, 55, 33, 99, 49};
        // System.out.println(bingo[6]);

        // String[] t1 = {"aa", "BB", "CC"};

        // boolean a[] = {true, false};

        // 宣告一個String array 變數名: students 裡面放8個學生名稱 請印出索引值4的學生
        // String[] students = {"A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8"};
        // System.out.println(students[4]);

        // int[] scores = {55, 36, 89, 77, 64, 13, 56, 99};
        // System.out.println("第1位同學:" + students[0] + "--分數:" + scores[0]);
        // System.out.println("第2位同學:" + students[1] + "--分數:" + scores[1]);
        // System.out.println("第3位同學:" + students[2] + "--分數:" + scores[2]);
        // System.out.println("第4位同學:" + students[3] + "--分數:" + scores[3]);
        // System.out.println("第5位同學:" + students[4] + "--分數:" + scores[4]);
        // System.out.println("第6位同學:" + students[5] + "--分數:" + scores[5]);
        // System.out.println("第7位同學:" + students[6] + "--分數:" + scores[6]);
        // System.out.println("第8位同學:" + students[7] + "--分數:" + scores[7]);

        // 請用for 迴圈 印出8位同學的姓名&成績
        // for(int x=0; x < 8; x++) {
        // for(int x=0; x <= 7; x++) {
        // for(int x=0; x < students.length -1; x++) {
        
        //     System.out.println("第"+ (x+1) +"位同學:" + students[x] + "--分數:" + scores[x]);
        // }

        // 印出99乘法表
        // for(int i = 1; i <= 9; i++) {
        //     for(int j = 1; j <= 9; j++ ) {
        //         // System.out.print(j + " ");
        //         System.out.print(i + "x" + j + "=" + (i * j) + "\t");
        //     }
        //     System.out.println(); // 換行
        // }

        //印出金字塔
        //   __*   1,2
        //   _***  3,1
        //   ***** 5,0

        // if(條件成立) {

        // } else {

        // }
        // int max = 5;
        // for(int i = 1; i <= max; i++) {
        //     // 印出偶數
        //     if(i % 2 == 0) {
                
        //     } else {
        //         // 由左到右印出空白
        //         int space = (max - i) / 2;
        //         for(int k=1; k <= space;  k++) {
        //             System.out.print("_");
        //         }

        //         // 由左到右印出星星 最多跟i行一樣多
        //         for(int j=1; j<=i; j++) {
        //             System.out.print("*");
        //         }

        //         System.out.println(); // 只在奇數時換行
        //     }
        //     // System.out.println(); // 每i行都換行
        // }


        // continue : 直接結束這回合, 讓下一個人繼續
        // break    : 不管後面還幾個在等待 直接中斷整個迴圈
        // for(int x=1; x<=6; x++) {
        //     if(x == 2) {
        //         break;
        //     }

        //     // if(x < 3) {
        //     //     continue;
        //     // }

        //     System.out.println("迪士尼");
        //     System.out.println("滑水道");
        //     System.out.println(x);
        // }


        // && : 都要true
        // int a = 1;
        // int b = 2;
        // int c = 3;
        // // boolean and = (a == 1) && (b == 2);
        // if((a == 1) && (b == 2) && (c == 4)) {
        //     System.out.println("and設定條件成立");
        // } else {
        //     System.out.println("and設定條件不成立");
        // }

        // // || : 只要其中一個是true
        // if((a == 1) || (b == 2) || (c == 4)) {
        //     System.out.println("or設定條件成立");
        // } else {
        //     System.out.println("or設定條件不成立");
        // }

        // if(條件1) {

        // } else if(條件2) {

        // } else {
        //     // 條件1 && 條件2 以外
        // }


        // 課堂練習 
        // 請印出所有分數 並且判斷
        // 1.優秀(超過90分)
        // 2.需要再加強(超過且包含70分 , 小於90分)
        // 3.及格(超過且包含60分 , 小於70分)
        // 4.不及格(小於60分)
        // 最後印出 平均分數, 加總分數

        int[] scores1 = { 60, 55, 46, 99, 80, 20 };
        int total = 0;
        int avg   = 0;
        for(int x = 0; x < scores1.length; x++) {
            String wordString = "無";
            if(scores1[x] >= 90) {
                wordString = "優秀";
            } else if(scores1[x] >= 70 && scores1[x] < 90) {
                wordString = "需要再加強";
            } else if(scores1[x] >= 60 && scores1[x] < 70) {
                wordString = "及格";
            } else {
                wordString = "不及格";
            }

            System.out.println(scores1[x] + "..." + wordString);
            // 加總分數 = 每個分數累加
            total = total + scores1[x];

        }
        // 平均分數 = 加總分數 / 分數的數量
        avg = total / scores1.length;
        System.out.println("加總分數:" + total);
        System.out.println("平均分數:" + avg);
    }
}
