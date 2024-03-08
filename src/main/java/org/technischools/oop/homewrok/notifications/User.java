package org.technischools.oop.homewrok.notifications;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
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

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isEmailNotificationsOn == user.isEmailNotificationsOn && isSMSNotificationsOn == user.isSMSNotificationsOn && Objects.equals(login, user.login) && Objects.equals(email, user.email) && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, phoneNumber, isEmailNotificationsOn, isSMSNotificationsOn);
    }

    @Override
    public int compareTo(User o) {
        return login.compareTo(o.login);
    }
}
