package abstractIntroduction;

// 抽象類別
public abstract class Notification {
    private String recipint;

    public Notification(String recipint) {
        this.recipint = recipint;
    }

    // 抽象方法: 類比為書的目錄, 子類別繼承後必須實作
    public abstract void send();

    // 其他方法
    public void log() {
        System.out.println("已送出通知給:" + this.recipint);
    }

    public String getRecipint() {
        return this.recipint;
    }

}
