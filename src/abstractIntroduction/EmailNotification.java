package abstractIntroduction;

public class EmailNotification extends Notification{

    public EmailNotification(String recipint) {
        super(recipint);
    }

    @Override
    public void send() {
        System.out.println("寄送Email給" + getRecipint());
    }
}
