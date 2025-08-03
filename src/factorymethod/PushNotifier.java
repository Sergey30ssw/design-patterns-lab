package factorymethod;

public class PushNotifier extends Notifier {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}