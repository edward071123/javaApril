package basic;
public class StudentPlus {
    // 屬性
    private String name;
    private int number;
    private int score;

    public StudentPlus(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // 設定姓名
    public void setName(String name, String password) {
        // java 的 字串比對
        if(password.equals("123123")) {
            this.name = name;
            System.out.println("密碼比對成功, 已變更學生資料");
        } else {
            System.out.println("密碼錯誤, 無法變更學生資料");
        }
    }

    // 取得姓名
    public String getName() {
        return this.name;
    }

    // 設定學號
    public void setNumber(int number) {
        this.number = number;
    }

    // 取得學號
    public int getNumber() {
        return this.number;
    }

    // 設定分數
    public void setScore(int score) {
        this.score = score;
    }

    // 取得分數
    public int getScore() {
        return this.score;
    }
}
