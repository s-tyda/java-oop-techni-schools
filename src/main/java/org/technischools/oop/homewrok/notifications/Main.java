package org.technischools.oop.homewrok.notifications;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", "email1");
        User user2 = new User("user2", "email2");
        User user3 = new User("user3", "email3");
        Set<User> users = new TreeSet<>();
        users.add(user3);
        users.add(user3);
        users.add(user1);
        users.add(user2);
        users.add(user2);
        System.out.println(users);

        String x = "alicja";
        for (int i = 0; i < x.length(); i++) {
            char pom = x.charAt(i);
        }
    }
}
