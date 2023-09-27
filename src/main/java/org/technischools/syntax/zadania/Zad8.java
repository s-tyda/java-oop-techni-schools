package org.technischools.syntax.zadania;

public class Zad8 {
    public static void main(String[] args) {
        int[] tablica = new int[] {-4, -2, -12, 30};
        int x = tablica[0];
        for (int i: tablica) {
            if(i > x){
                x = i;
            }
        }
        System.out.println(x);
    }
}
