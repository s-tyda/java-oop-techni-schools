package org.technischools.syntax.zadania;

public class Zad11 {
    public static float average(int[] tablica) {
        int sum = 0;
        for(int i : tablica) {
            sum += i;
        }
        int list_length = tablica.length;
        return (float)sum / list_length;
    }


}
