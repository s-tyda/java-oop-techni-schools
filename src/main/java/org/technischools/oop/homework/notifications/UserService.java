package org.technischools.oop.homework.notifications;

import java.util.LinkedList;
import java.util.List;

public class UserService {
    private List<User> users = new LinkedList<>();

    public User find(String email) {
        for (User i: users) {
            if(email.equals(i.getEmail())) {
                return i;
            }
        }
        return null;
    }

    // Napisz metodę dodającą obiekt klasy User do listy users

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }
}
