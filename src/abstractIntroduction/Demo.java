package abstractIntroduction;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 抽象abstract 介紹&使用
        Notification email = new EmailNotification("aa@gmail.com");
        email.send();
        email.log();

        Notification sms = new SmsNotification("0912001001");
        sms.send();
        sms.log();

        // 多型 + for + array
        Notification[] notifications = {
            new EmailNotification("aa@gmail.com"),
            new SmsNotification("0912001001")
        };

        for(int i = 0; i < notifications.length; i++) {
            notifications[i].send();
            notifications[i].log();
        }
    }
}
