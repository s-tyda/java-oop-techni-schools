package org.technischools.introduction.zadania;

/*
Przerób pętlę z zadania poprzedniego na pętlę while.
*/

public class Zad6 {
    public static void main(String[] args) {
        int i = -10;
        while(i < 40){
            if(i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
