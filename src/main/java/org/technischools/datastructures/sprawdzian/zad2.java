package org.technischools.datastructures.sprawdzian;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class zad2 {
    public static Set<Character> letters(String text) {
        Set<Character> set = new LinkedHashSet<>();
        text = text.toLowerCase();
        for (int i=0; i<text.length(); i++) {
            set.add(text.charAt(i));
        }
        return set;
    }
}
