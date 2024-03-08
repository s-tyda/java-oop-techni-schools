package org.technischools.oop.homework.notifications;

import org.technischools.oop.homewrok.animals.Maqaque;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    public User(String login, String email, String phoneNumber, boolean isEmailNotificationsOn, boolean isSMSNotificationsOn) {
        this.login = login;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isEmailNotificationsOn = isEmailNotificationsOn;
        this.isSMSNotificationsOn = isSMSNotificationsOn;
    }

    public User() {
    }

    private String login;
    private String email;
    private String phoneNumber;
    private boolean isEmailNotificationsOn;
    private boolean isSMSNotificationsOn;
    private Maqaque maqaque;

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
                "login='" + login + '}';
    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "login='" + login + '\'' +
//                ", email='" + email + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", isEmailNotificationsOn=" + isEmailNotificationsOn +
//                ", isSMSNotificationsOn=" + isSMSNotificationsOn +
//                ", maqaque=" + maqaque +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isEmailNotificationsOn == user.isEmailNotificationsOn && isSMSNotificationsOn == user.isSMSNotificationsOn && Objects.equals(login, user.login) && Objects.equals(email, user.email) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(maqaque, user.maqaque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, phoneNumber, isEmailNotificationsOn, isSMSNotificationsOn, maqaque);
    }

    @Override
    public int compareTo(User o) {
        return this.login.compareTo(o.login);
    }
}
