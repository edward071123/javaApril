package basic;
public class ObjectUsed {
    public static void main(String[] args) throws Exception {
        // 想像學校註冊組 準備幫學生建檔
        // 實體化變成一個object(物件)
        // Student st1 = new Student(); // 不用寫建構子
        // Student st1 = new Student("David", 1);
        // st1.setScoreM(60);
        // System.out.println("傳入參數前印出:" + st1.name);
        // // 呼叫方法, 傳入參數
        // // st1.init("David", 1);
        // // 查看屬性
        // System.out.println("傳入參數後印出:" + st1.name);
        // System.out.println("傳入參數後印出:" + st1.number);
        // System.out.println("傳入參數後印出:" + st1.score);

        // Student st2 = new Student("Mike", 2);
        // st2.setScoreM(80);
        // // st2.init("Mike", 2);
        // System.out.println("傳入參數後印出第2個同學:" + st2.name);
        // System.out.println("傳入參數後印出第2個同學:" + st2.number);
        // System.out.println("傳入參數後印出第2個同學:" + st2.score);    
        // // 請在Student.java 做一個方法 可以寫入分數 最後在main 印出分數檢查是否被改寫

        // st2.name = "aa";
        // st2.score = 100;
        // System.out.println("印出第2個同學改寫的名字:" + st2.name);
        // System.out.println("印出第2個同學改寫的分數:" + st2.score);

        // 使用嚴謹的系統 StudentPlus.java 來重建學生資料
        StudentPlus stp1 = new StudentPlus("Devid", 1);
        StudentPlus stp2 = new StudentPlus("Mike", 2);
        // 無法直接取得屬性
        // System.out.println("新系統第一個學生名字:" + stp1.name);
        // System.out.println("新系統第二個學生名字:" + stp2.name);

        // 使用手續(方法)去拿屬性資料
        System.out.println("新系統第一個學生名字:" + stp1.getName());
        System.out.println("新系統第二個學生名字:" + stp2.getName());

        // 使用手續(方法)去改屬性資料
        stp1.setName("David", "123123");
        System.out.println("新系統第一個學生名字改變後:" + stp1.getName());

    }
}
