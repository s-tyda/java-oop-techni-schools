package org.technischools.introduction.zadania;

/*
1. Przerób program z zadania 7 tak, żeby obliczył sumę elementów tablicy dwuwymiarowej typu int[][].

2*. Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących
do przechowywania sudoku i uzupełnij ją przykładową planszą.

3*. Jak przechowałbyś stan gry w szachy? Napisz program, który stworzy instancje tablic służące
do przechowywania stanu gry w szachy. Potrafiłbyś zachować w nim ostatni stan 5 partii Kasparowa
z Deep Blue z 1997 roku?
*/

public class Zad9 {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int []{1 ,2, 3};
        array[1] = new int [] {4, 5, 6};
        int sum = 0;
        for (int [] i: array) {
            for(int j: i) {
                sum += j;
            }
        }

        sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
