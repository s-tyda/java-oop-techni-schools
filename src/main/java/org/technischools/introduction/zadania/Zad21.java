package org.technischools.introduction.zadania;

/*
1. Utwórz metodę pobierającą dodatnią liczbę całkowitą x, która wyświetli na ekranie liczby od zera do x.
2. Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie).
*/

public class Zad21 {
    public static void printNumbersFromZeroToX(int x){
        for(int i = 0; i <= x; i++){
            System.out.println(i);
        }
    }

    public static void printNumbersFromZeroToX2(int x){
        int i = 0;
        while(i <= x){
            System.out.println(i);
            i++;
        }
    }
}
