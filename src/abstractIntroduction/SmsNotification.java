package abstractIntroduction;

public class SmsNotification extends Notification{
    
    public SmsNotification(String recipint) {
        super(recipint);
    }

    @Override
    public void send() {
        System.out.println("寄送Sms給" + getRecipint());
    }
}
