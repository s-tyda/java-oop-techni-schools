package org.technischools.datastructures.gr1;

import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.println(isPangram3("waltzbadnymphforquickjigsvex"));
    }
    public static boolean isPangram(String sen){
        boolean[] alphabet = new boolean[26];
        int index;
        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);
            if ('a' <= ch && ch <= 'z'){
                index = ch - 'a';
                alphabet[index] = true;
            }
        }

        for(boolean letterPresent : alphabet){
            if(!letterPresent){
                return false;
            }
        }
        return true;
    }

    public static boolean isPangram2(String sen){
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < sen.length(); i++) {
            characters.add(sen.charAt(i));
        }
        return characters.size() == 26;
    }

    public static boolean isPangram3(String sen){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if (!sen.contains(String.valueOf(alphabet.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}
