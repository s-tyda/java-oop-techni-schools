package org.technischools.datastructures.gr1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//4. Napisz funkcję, która zwróci różnicę asymetryczną dwóch zbiorów.
public class Zad1_4 {
    public static Set<Integer> MinusSet(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new LinkedHashSet<>(set1);
        set3.removeAll(set2);
        return set3;
    }
}
