package org.technischools.oop.homework.notifications;

public interface NotificationProvider {
    void send(String message, User user);
}
