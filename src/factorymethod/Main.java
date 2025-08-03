package factorymethod;

public class Main {
    public static void main(String[] args) {
        String notifierType = args.length > 0 ? args[0] : "email";

        Notifier notifier = switch(notifierType.toLowerCase()) {
            case "email" -> new EmailNotifier();
            case "sms" -> new SmsNotifier();
            case "push" -> new PushNotifier();
            default -> throw new IllegalArgumentException("Invalid notifier type: " + notifierType);
        };

        notifier.notifyUser("Hello World!");
    }
}