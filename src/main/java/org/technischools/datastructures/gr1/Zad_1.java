package org.technischools.datastructures.gr1;

import java.util.*;

public class Zad_1 {
    public static boolean is_Anagram(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }
        List<Character> word1_set = new ArrayList<>();
        List<Character> word2_set = new ArrayList<>();

        for (int i = 0; i < word1.length(); i++) {
            word1_set.add(word1.charAt(i));
        }
        for (int i = 0; i < word2.length(); i++) {
            word2_set.add(word2.charAt(i));
        }

        Collections.sort(word1_set);
        Collections.sort(word2_set);
        return word1_set.equals(word2_set);
    }

    public static boolean isAnagram2(String word1, String word2){
        if (word1.length() != word2.length()){
            return false;
        }

        char[] word1Chars = word1.toLowerCase().toCharArray();
        char[] word2Chars = word2.toLowerCase().toCharArray();

        Arrays.sort(word1Chars);
        Arrays.sort(word2Chars);

        return Arrays.equals(word1Chars, word2Chars);
    }

    public static void main(String[] args) {
        System.out.println(is_Anagram("babek", "kebab"));
        System.out.println(isAnagram2("babek", "kebab"));
    }
}
