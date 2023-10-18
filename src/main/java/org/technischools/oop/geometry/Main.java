package org.technischools.oop.geometry;

public class Main {
    public static void main(String[] args) {
        FiguraGeometryczna kwadrat = new Kwadrat(5);
        FiguraGeometryczna prostokat = new Prostokat(10, 69);
        FiguraGeometryczna trojkat = new Trojkat(3, 4, 5);

        System.out.println(kwadrat.obw());
        System.out.println(kwadrat.pole());
        System.out.println(prostokat.obw());
        System.out.println(prostokat.pole());
        System.out.println(trojkat.pole());
        System.out.println(trojkat.obw());

    }


}
