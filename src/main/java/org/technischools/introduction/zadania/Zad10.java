package org.technischools.introduction.zadania;

/*
Napisz metodę przyjmującą dwuelementową tablicę liczb i zwracającą ich sumę.
*/

public class Zad10 {
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}