package org.technischools.introduction.zadania;

/*
Napisz program, która dla tablicy typu int[] wyświetli sumę wszystkich elementów tablicy.
*/

import java.util.Arrays;

public class Zad7 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 12, 22, 33};
        int sum = 0;
        for (int i: array) {
            sum = sum + i;
        }
        System.out.println(sum);

        // Alternatywna opcja, dla chętnych na ten moment
        int sum2 = Arrays.stream(array)
                .sum();
        System.out.println(sum2);
    }
}