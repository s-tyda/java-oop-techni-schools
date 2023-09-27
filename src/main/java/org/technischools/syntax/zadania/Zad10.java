package org.technischools.syntax.zadania;

public class Zad10 {

    public static int funkcja(int[] tablica) {
        int sum = 0;
        for (int i : tablica) {
            sum += i;
        }
        return sum;
    }
}