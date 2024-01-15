package org.technischools.oop.homewrok.notifications;

public class NotificationService {
    private NotificationProvider[] providers;

    public NotificationService() {
        this.providers = new NotificationProvider[]{new EmailProvider(), new SMSProvider()};
    }

    public void notify(String message, User user){
        for (NotificationProvider provider:providers) {
            provider.send(message, user);
        }
    }
}
