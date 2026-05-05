package basic;
public class Method {
    public static void main(String[] args) throws Exception {
        System.out.println("Method");
        m1();
        m2("Edward");
        m3("David", 20, 50.2);
        
        int[] numbers = {50, 60, 70};
        m4(numbers);
        
        int getSum = m5(5, 10);
        System.out.println("main get sum from m5():" + getSum);

        int[] scores1 = {60, 80, 60};
        String message = m6("Mike", scores1);
        System.out.println("main get message from m6():" + message);
        // 請按照上面呼叫m6()的格式做出m6這個方法(函式) 回傳String: Mike的平均分數:xxx

        int[] scores2 = {99, 25, 30, 66, 77};
        int[] results = m7(scores2);
        System.out.println("m7()算出總分:" + results[0]);
        System.out.println("m7()算出平均分數:" + results[1]);
        // 請按照上面scores2做出m7()這個方法 回傳 int[] results = {總分, 平均分數};
    }
 // 前綴字   靜態    回傳型態  方法名稱(輸入型別 輸入參數) { 

    public  static  void      m1()                      {
        System.out.println("I'm M1");
    }

    public  static  void      m2(String name)            {
        System.out.println("I'm M2 get the name:" + name);
    } 

    public  static  void      m3(String name, int age, double weight) {
        System.out.println("I'm M3 get the name:" + name + ", age:" + age + ",weight:" + weight);
    }

    public  static  void      m4(int[] numbers) {
        for(int x=0; x< numbers.length; x++) {
            System.out.println("I'm M4 get the number:" + numbers[x]);
        }
    }

    public  static  int[]    m7(int[] scores2) {
        int total = 0;
        int avg   = 0;
        for(int x = 0; x < scores2.length; x++) {
            total = total + scores2[x];
        }

        avg = total / scores2.length;
        int[] result = {total, avg};
        return result;
    }    

    public  static  String   m6(String name, int[] scores1) {
        int total = 0;
        int avg   = 0;
        for(int x = 0; x < scores1.length; x++) {
            total = total + scores1[x];
        }

        avg = total / scores1.length;
        String result = name + "的平均分數:" + avg;
        return result;
    }

    public  static  int      m5(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}
