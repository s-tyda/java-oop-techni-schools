package org.technischools.syntax.zadania;

public class zad9 {
    protected static void main(String[] args) {
        int[][] tablica = new int[2][];
        tablica[0] = new int []{1 ,2, 3};
        tablica[1] = new int [] {4, 5, 6};
        int sum = 0;
        for (int [] i: tablica) {
            for(int j: i) {
                sum += j;
            }
        }

        sum = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                sum += tablica[i][j];
            }
        }
        System.out.println(sum);
    }
}
