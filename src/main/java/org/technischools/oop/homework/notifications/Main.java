package org.technischools.oop.homework.notifications;

// Utwórz metodę która przyjmie listę obiektów klasy User oraz email i zwróci
// użytkownika o danym adresie email. Jeśli takiego nie będzie, metoda zwróći null.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("techni", "example@example.com", null, false, false);
        User user2 = new User("techni1", "example1@example.com", null, false, false);
        User user3 = new User("techni2", "example2@example.com", null, false, false);

//        UserService userService = new UserService();
//        userService.addUser(user1);
//        userService.addUser(user2);
//        userService.addUser(user3);
//
//        System.out.println(userService.find("example@example.com"));
//        userService.removeUser(user1);
//        System.out.println(userService.find("example@example.com"));

//        Set<User> hashSet = new TreeSet<>();
//        hashSet.add(user1);
//        hashSet.add(user3);
//        hashSet.add(user2);
//        hashSet.add(user1);
//        System.out.println(hashSet);

        Map<String, User> userMap = new HashMap<>();
        userMap.put("login2", user2);
        userMap.put("login1", user1);
        userMap.put("login3", user3);
        System.out.println(userMap);
        System.out.println(userMap.get("login2"));
        System.out.println(userMap.get("niema"));
        User user4 = new User();
        System.out.println(user4);
        userMap.put("login1", user2);
        System.out.println(userMap);
        userMap.putIfAbsent("login1", user1);
        userMap.putIfAbsent("loginNowy", user1);
        System.out.println(userMap);

        System.out.println(countLetters("costammm"));
    }

    static Map<Character, Integer> countLetters(String text){
        Map<Character, Integer> lettersMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
//            if (lettersMap.containsKey(text.charAt(i))){
//                lettersMap.put(letter, lettersMap.get(letter) + 1);
//            }else {
//                lettersMap.put(letter, 1);
//            }
            lettersMap.putIfAbsent(letter, 0);
            lettersMap.put(letter, lettersMap.get(letter) + 1);
        }
        return lettersMap;
    }

//     static Map<String, Integer> dupa(String text){
//        Map<String, Integer> wordMap = new HashMap<>();
//        String[] jakubMarzeda = text.split(" ");
//         for (int i = 0; i < jakubMarzeda.length ; i++) {
//             String word = jakubMarzeda[i];
//
//         }
//     }

}
