package org.technischools.introduction.zadania;

/*
Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić
informację czy z odcinków o długości przekazanych w argumentach można zbudować trójkąt.
*/

public class Zad19 {
    public static boolean triangle(int a, int b, int c){
        if (a >= b && a >= c) {
            return b + c > a;
        } else if (b >= a && b >= c) {
            return a + c > b;
        } else {
            return a + b > c;
        }
    }
}
