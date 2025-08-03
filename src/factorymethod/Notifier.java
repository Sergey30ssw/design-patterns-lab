package factorymethod;

public abstract class Notifier {
    public abstract Notification createNotification();

    public void notifyUser(String text) {
        Notification notification = createNotification();
        notification.send(text);
    }
}