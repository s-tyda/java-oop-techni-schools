package org.technischools.datastructures.gr2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("dog", "pies");
        System.out.println(map.get("dog"));
        // put podmienia wartosć na kluczu
//        map.put("dog", "kot");
        // putIfAbsent umieszcza wartosć tylko jesli klucza nie było
        map.putIfAbsent("dog", "kot");
        map.putIfAbsent("cat", "kot");
        System.out.println(map.get("dog"));
//        map.remove("dog");
        System.out.println(map.get("dog"));
        System.out.println(map.getOrDefault("dog", "default"));

        System.out.println("------");
        for (String key:map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("------");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }

        Set<String> values = new HashSet<>(map.values());

    }
}
