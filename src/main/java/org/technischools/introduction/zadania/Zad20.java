package org.technischools.introduction.zadania;

/*
Przerób poprzednie zadanie, tak by metoda zwracała informację czy z podanych liczb można utworzyć trójkat prostokątny.
*/

public class Zad20 {
    public static boolean triangle(int a, int b, int c){
        if (a >= b && a >= c) {
            return b * b + c * c == a * a;
        } else if (b >= a && b >= c) {
            return a * a + c * c == b * b;
        } else {
            return a * a + b * b == c * c;
        }
    }
}
