package lesson1;
import basic.StudentPlus;
import basic.test.Student;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 未import前呼叫別的部門的類別
        basic.StudentPlus stp1 = new basic.StudentPlus("Edward1", 1);
        basic.StudentPlus stp2 = new basic.StudentPlus("Edward2", 2);
        basic.StudentPlus stp3 = new basic.StudentPlus("Edward3", 3);
        
        // 使用import後呼叫別的部門的類別
        StudentPlus stp4 = new StudentPlus("Edward4", 4);
        Student st5 = new Student("Edward5", 5);


        // 多載(OverLoading): 相同方法名稱 不同的輸入參數, 或是不同的輸入參數型別
        Area a1 = new Area();
        a1.cal(5, 3);
        a1.cal(4);
        a1.cal(4, "圓形");
        a1.cal(4.0);
        // 請弄一個三角形的面積計算多載方法
        a1.cal(5, 3, "三角形");
    }

}
