package org.technischools.introduction.zadania;

/*
Napisz metodę, który policzy średnią z kilku przedmiotów.
Możemy założyć, że uczeń w szkole ma 2 przedmioty i z każdego z nich dostał po 3 oceny.
*/

public class Zad11 {
    public static float average(int[] array) {
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        int list_length = array.length;
        return (float)sum / list_length;
    }


}
