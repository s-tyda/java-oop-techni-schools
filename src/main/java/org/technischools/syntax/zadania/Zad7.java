package org.technischools.syntax.zadania;

public class Zad7 {
    public static void main(String[] args) {
        int[] tablica = new int[] {1, 2, 3, 4, 5, 12, 22, 33};
        int x = 0;
        for (int i: tablica) {
            x = x + i;
        }
        System.out.println(x);
    }
}

//Napisz program, która dla tablicy typu int[] wyświetli sumę wszystkich elementów tablicy.