package org.technischools.introduction.zadania;

/*
Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.
*/

import java.util.Arrays;

public class Zad08 {
    public static void main(String[] args) {
        int[] array = new int[] {-4, -2, -12, 30};
        int max = array[0];
        for (int i: array) {
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);

        // Alternatywna opcja, dla chętnych na ten moment
        int max2 = Arrays.stream(array)
                .max()
                .getAsInt();
        System.out.println(max2);
    }
}
