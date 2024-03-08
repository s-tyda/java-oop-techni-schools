package org.technischools.datastructures.gr2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countElements {
    public static Map<String, Integer> list(List<String> StringList) {
        Map<String, Integer> count = new HashMap<>();
        for (String element: StringList) {
            if (!count.containsKey(element)) {
                count.put(element, 1);
            }
            else {
                count.put(element, count.get(element) + 1);
            }

        }
        return count;
    }

    public static Map<String, Integer> list2(List<String> StringList) {
        Map<String, Integer> count = new HashMap<>();
        for (String element: StringList) {
            count.putIfAbsent(element, 0);
            count.put(element, count.get(element) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        List<String > TestList = Arrays.asList("dwa", "dwa", "trzy", "piec");
        System.out.println(list2(TestList));
        System.out.println(countDupitactes2(TestList));
    }
    public static Map<String,Integer> countDupitactes(List<String> StringList) {
        Map<String, Integer> count = list2(StringList);
        for (String element : StringList) {
            if (count.get(element) <= 1) {
                count.remove(element);
            }
        }
        return count;

    }

    public static Map<String,Integer> countDupitactes2(List<String> StringList) {
        Map<String, Integer> count = list2(StringList);
        Map<String, Integer> result = new HashMap<>();
        for (String element : count.keySet()) {
            if (count.get(element) > 1) {
                result.put(element, count.get(element));
            }
        }
        return result;
    }
}
