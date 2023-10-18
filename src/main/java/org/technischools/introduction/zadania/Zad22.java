package org.technischools.introduction.zadania;

public class Zad22 {
    public static int table(int[] zad){
        int iloczyn = 1;
        for (int a: zad)
        {
            iloczyn *= a;
        }
        return iloczyn;
    }
}


//    Napisz metodę, która przyjmie tablicę liczb całkowitych i zwróci iloczyn jej elementów.