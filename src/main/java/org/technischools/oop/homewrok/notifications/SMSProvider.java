package org.technischools.oop.homewrok.notifications;

public class SMSProvider implements NotificationProvider{
    @Override
    public void send(String message, User user) {
        if (user.isSMSNotificationsOn()){
            System.out.println("SMS");
        }
    }
}
