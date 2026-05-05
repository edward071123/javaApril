package basic;
public class MethodPlus {
    public static void main(String[] args) throws Exception {
        // 金字塔

        // // 如果不用method做一次呈現三組金字塔的code:起點
        // int max1 = 1;
        // for(int i = 1; i <= max1; i++) {
        //     // 印出偶數
        //     if(i % 2 == 0) {
                
        //     } else {
        //         // 由左到右印出空白
        //         int space = (max1 - i) / 2;
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

        // int max3 = 3;
        // for(int i = 1; i <= max3; i++) {
        //     // 印出偶數
        //     if(i % 2 == 0) {
                
        //     } else {
        //         // 由左到右印出空白
        //         int space = (max3 - i) / 2;
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

        // int max5 = 5;
        // for(int i = 1; i <= max5; i++) {
        //     // 印出偶數
        //     if(i % 2 == 0) {
                
        //     } else {
        //         // 由左到右印出空白
        //         int space = (max5 - i) / 2;
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
        // // 如果不用method做一次呈現三組金字塔的code:結束

        // // 如果用method做一次呈現六組金字塔的code:起點
        // pyramid(1);
        // pyramid(3);
        // pyramid(5);
        // pyramid(7);
        // pyramid(9);
        // pyramid(11);
        // // 如果用method做一次呈現六組金字塔的code:結束

        // // 相乘的結果 
        // // (1) 直接印出 >> multiply1()
        // // (2) 回傳後在main上印出 >> multiply2()
        // // 直接印出呼叫
        // multiply1(5, 6);

        // //回傳後在main上印出呼叫
        // System.out.println("回傳後在main上印出-multiply2:" + multiply2(7, 8));
        // System.out.println("回傳後在main上印出-multiply21:" + multiply21(7, 8));


        // 課後練習題
        // 實作method: findMax(int[]), findMin(int[])
        // 講解: findMax(): 回傳最大值到main印出(用for + if )
        // 講解: findMin(): 直接印出最小值(用for + if )
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int getMax = findMax(numbers);
        System.out.println("最大值為:" + getMax);
        findMin(numbers);
    }

    public static void multiply1(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("直接印出乘法結果:" + result);
    }

    public static int multiply2(int num1, int num2) {
        return num1 * num2;
    }

    // 對照multiply2的階段寫法
    public static int multiply21(int num1, int num2) {
        // 用int變數去接 運算結果
        int result = num1 * num2;
        // 回傳變數
        return result;
    }
    

    //JS
    // function pryamid(max) {
    //      return "zzz";
    // }
    // 收納重複使用的code
    public static void pyramid(int max) {
        for(int i = 1; i <= max; i++) {
            // 印出偶數
            if(i % 2 == 0) {
                
            } else {
                // 由左到右印出空白
                int space = (max - i) / 2;
                for(int k=1; k <= space;  k++) {
                    System.out.print("_");
                }

                // 由左到右印出星星 最多跟i行一樣多
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                System.out.println(); // 只在奇數時換行
            }
            // System.out.println(); // 每i行都換行
        }
        System.out.println("印出金字塔"+max+"結束");
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void findMin(int[] numbers) {
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
             if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("最小值為:" + min);
    }

}
