package org.technischools.introduction.zadania;

/*
Napisz metodę, która jako argument przyjmuje liczbę i zwraca informację czy liczba jest parzysta.
*/

public class Zad15 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven2(int number) {
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
