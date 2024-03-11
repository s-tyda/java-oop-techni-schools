package org.technischools.datastructures.gr1;

import java.util.*;

public class Zad1_3 {
    public static boolean isPerfectPangram(String str1) {
        str1 =  str1.replaceAll(" ", "");
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Arrays.sort(arr1);
        if (arr1.length != 26) {
            return false;
        } else {
            return Arrays.equals(arr1, abc);
        }
    }

    public static boolean isPerfectPangram2(String str1) {
        return Zad_1.is_Anagram(str1, "abcdefghijklmnopqrstuvwxyz");
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
        set2.add(1);
        set2.add(4);
        set2.add(5);
        System.out.println(intersection(set1, set2));
        System.out.println(isSubset(set2, set1));
        System.out.println(sumSets(set1, set2));
    }

    public static Set<Integer> sumSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new LinkedHashSet<>(set1);
        set3.addAll(set2);
        return set3;
    }

    public static boolean isSubset(Set<Integer> set, Set<Integer> subset){
        return set.containsAll(subset);
    }

    public static Set<Integer> commonPart(Set<Integer> first, Set<Integer> second){
        Set<Integer> common = new HashSet<Integer>();
        for (Integer iterator: first) {
            if (second.contains(iterator)){
                common.add(iterator);
            }
        }
        return common;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

}
