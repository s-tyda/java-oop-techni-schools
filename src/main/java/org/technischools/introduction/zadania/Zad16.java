package org.technischools.introduction.zadania;

/*
Napisz metodę, która jako argument przyjmuje liczbę
i zwraca informację czy liczba jest podzielna przez 3 i przez 5.
*/

public class Zad16 {
    public static boolean isDivisbleBy3And5(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return true;
        }
        return false;
    }
}
