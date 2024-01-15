package org.technischools.oop.homework.notifications;

public class User {
    private String login;
    private String email;
    private String phoneNumber;
    private boolean isEmailNotificationsOn;
    private boolean isSMSNotificationsOn;

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isEmailNotificationsOn() {
        return isEmailNotificationsOn;
    }

    public boolean isSMSNotificationsOn() {
        return isSMSNotificationsOn;
    }
}
