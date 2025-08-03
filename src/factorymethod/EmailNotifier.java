package factorymethod;

public class EmailNotifier extends Notifier {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}