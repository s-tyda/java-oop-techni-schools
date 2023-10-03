package org.technischools.introduction;

import org.technischools.introduction.zadania.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 30};

        // Test zad 10
        System.out.println("Zad10");
        System.out.println(Zad10.arraySum(array));

        // Test zad 11
        System.out.println("\nZad11");
        System.out.println(Zad11.average(array));

        // Test zad 12
        System.out.println("\nZad12");
        System.out.println(Zad12.getAge());

        // Test zad 13
        System.out.println("\nZad13");
        System.out.println(Zad13.myName());

        // Test zad 14
        System.out.println("\nZad14");
        Zad14.printNumberOperations(15, 7);

        // Test zad 15
        System.out.println("\nZad15");
        System.out.println(Zad15.isEven(5));
        System.out.println(Zad15.isEven2(6));

        // Test zad 16
        System.out.println("\nZad16");
        System.out.println(Zad16.isDivisbleBy3And5(15));
        System.out.println(Zad16.isDivisbleBy3And5(16));

        // Test zad 17
        System.out.println("\nZad17");
        System.out.println(Zad17.toThirdPower(5));
        System.out.println(Zad17.toThirdPower2(5));

        // Test zad 18
        System.out.println("\nZad18");
        System.out.println(Zad18.sqrt(49));
        System.out.println(Zad18.sqrt(666));

        // Test zad 19
        System.out.println("\nZad19");
        System.out.println(Zad19.triangle(2, 5, 8));
        System.out.println(Zad19.triangle(8, 5, 2));
        System.out.println(Zad19.triangle(6, 5, 2));

        // Test zad 20
        System.out.println("\nZad20");
        System.out.println(Zad20.triangle(3, 4, 5));
        System.out.println(Zad20.triangle(13, 5, 12));
        System.out.println(Zad20.triangle(8, 10, 6));
        System.out.println(Zad20.triangle(1, 2, 3));

        // Test zad 21
        System.out.println("\nZad21.1");
        Zad21.printNumbersFromZeroToX(3);
        System.out.println("\nZad21.2");
        Zad21.printNumbersFromZeroToX2(3);
    }
}
