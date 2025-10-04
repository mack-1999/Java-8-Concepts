// High-level module
class Notification {
    private MessageService messageService;

    // Dependency is injected via constructor (Dependency Injection)
    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}