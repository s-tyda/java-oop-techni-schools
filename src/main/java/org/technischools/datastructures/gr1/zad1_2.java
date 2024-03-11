package org.technischools.datastructures.gr1;

import java.util.HashSet;
import java.util.Set;

public class zad1_2 {
    public static Set<Character> setFromWord(String name){
        Set<Character> res = new HashSet<>();
        for (int i = 0; i < name.length(); i++){
            res.add(name.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(setFromWord("alicja"));
    }
}
