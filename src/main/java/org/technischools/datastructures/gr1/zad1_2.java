package org.technischools.datastructures.gr1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class zad1_2 {
    public static Set<Character> dupa(String name){
        Set<Character> res = new HashSet<>();
        for (int i = 0; i < name.length(); i++){
            res.add(name.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(dupa("alicja"));
    }
}
