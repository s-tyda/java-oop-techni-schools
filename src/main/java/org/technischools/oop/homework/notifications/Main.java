package org.technischools.oop.homework.notifications;

// Utwórz metodę która przyjmie listę obiektów klasy User oraz email i zwróci
// użytkownika o danym adresie email. Jeśli takiego nie będzie, metoda zwróći null.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("techni", "example@example.com", null, false, false);
        User user2 = new User("techni1", "example1@example.com", null, false, false);
        User user3 = new User("techni2", "example2@example.com", null, false, false);

        UserService userService = new UserService();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        System.out.println(userService.find("example@example.com"));
        userService.removeUser(user1);
        System.out.println(userService.find("example@example.com"));
    }

}
