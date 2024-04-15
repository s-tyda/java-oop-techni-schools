package org.technischools.datastructures.sprawdzian;

import java.util.Arrays;

public class zad1 {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()){
            return false;
        }

        char[] arr1 = word1.toLowerCase().replaceAll(" ", "").toCharArray();
        char[] arr2 = word2.toLowerCase().replaceAll(" ", "").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr2, arr1);
    }
}
