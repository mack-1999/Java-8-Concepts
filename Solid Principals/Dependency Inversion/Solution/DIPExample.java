// Abstraction
interface MessageService {
    void sendMessage(String message);
}

// Low-level module: Email
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// Low-level module: SMS
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Test
public class DIPExample {
    public static void main(String[] args) {
        Notification emailNotification = new Notification(new EmailService());
        emailNotification.notifyUser("Hello via Email!");

        Notification smsNotification = new Notification(new SMSService());
        smsNotification.notifyUser("Hello via SMS!");
    }
}
