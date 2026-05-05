package basic.test;
public class Student {
    // 屬性
    String name;
    int number;
    int score;

    // 與類別同名稱的方法: 建構子
    public Student(String setName, int setNumber) {
        this.name = setName;
        this.number = setNumber;
    }
    
    // 方法
    public void init(String setName, int setNumber) {
        this.name = setName;
        this.number = setNumber;
    }

    public void setScoreM(int setScore) {
        this.score = setScore;
    }
}
