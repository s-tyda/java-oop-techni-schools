package org.technischools.datastructures.gr2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class zad1 {
    public static Set<Character> letters(String text) {
        Set<Character> set = new TreeSet<>();
        for (int i=0; i<text.length(); i++) {
            set.add(text.charAt(i));
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(letters("alicja"));
    }
}
