package org.technischools.introduction.zadania;

/*
Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę, iloczyn oraz iloraz.
*/

public class Zad14 {
    public static void printNumberOperations(int a, int b){
        System.out.println("Sum=" + (a + b));
        System.out.println("Diff=" + (a - b));
        System.out.println("Product=" + (a * b));
        System.out.println("Quotient=" + ((double)a / b));
    }
}
