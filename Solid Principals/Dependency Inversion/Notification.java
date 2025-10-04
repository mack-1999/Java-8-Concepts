class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

@SuppressWarnings("unused")
class Notification {
    EmailService emailService = new EmailService();

    public void send(String message) {
        emailService.sendEmail(message);  // tightly coupled to EmailService
    }
}

/*
 Definition: High-level modules should not depend on low-level modules. 
 Both should depend on abstractions (interfaces).

 Notification (high-level module) depends on EmailService (low-level module).
 If we want to add SMSService or WhatsAppService, we must modify Notification.
 This violates OCP and DIP.
*/