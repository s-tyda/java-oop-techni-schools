package org.technischools.oop.homework.notifications;

public class User {
    public User(String login, String email, String phoneNumber, boolean isEmailNotificationsOn, boolean isSMSNotificationsOn) {
        this.login = login;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isEmailNotificationsOn = isEmailNotificationsOn;
        this.isSMSNotificationsOn = isSMSNotificationsOn;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isEmailNotificationsOn=" + isEmailNotificationsOn +
                ", isSMSNotificationsOn=" + isSMSNotificationsOn +
                '}';
    }
}
