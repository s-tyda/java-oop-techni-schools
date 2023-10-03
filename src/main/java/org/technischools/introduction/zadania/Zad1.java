package org.technischools.introduction.zadania;

/*
Napisz program, który wyświetli trzy różne zdania opisujące aktualną pogodę.
W czwartej linii wypisz sumaryczną długość trzech poprzednich zdań.
*/

public class Zad1 {
    public static void main(String[] args) {
        String a = "dzis jest cieplo";
        String b = "dzis nie jest cieplo";
        String c = "nie pada";
        int lenghtSum = a.length() + b.length() + c.length();
        System.out.println(lenghtSum);
    }
}
