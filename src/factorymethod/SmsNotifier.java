package factorymethod;

public class SmsNotifier extends Notifier {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}