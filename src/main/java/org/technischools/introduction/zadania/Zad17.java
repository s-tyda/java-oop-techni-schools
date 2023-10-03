package org.technischools.introduction.zadania;

/*
Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
*/

public class Zad17 {
    public static int toThirdPower(int number){
        return number * number * number;
    }

    public static int toThirdPower2(int number){
        return (int) Math.pow(number, 3);
    }
}
