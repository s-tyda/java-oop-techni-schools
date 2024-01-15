package org.technischools.oop.homework.notifications;

public class EmailProvider implements NotificationProvider{
    @Override
    public void send(String message, User user) {
        if (user.isEmailNotificationsOn()){
            System.out.println("EMAIL");
        }
    }
}
