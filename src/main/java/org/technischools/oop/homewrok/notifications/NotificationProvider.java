package org.technischools.oop.homewrok.notifications;

public interface NotificationProvider {
    void send(String message, User user);
}
