package org.technischools.oop.Geometria;
public class Main {
    public static void main(String[] args) {
        FiguraAbstrakcyjna kwadrat = new Kwadrat(5);
        System.out.println(kwadrat.pole());
        System.out.println(kwadrat.obwod());

        FiguraAbstrakcyjna prostokat = new Prostokat(4, 5);
        System.out.println(prostokat.pole());
        System.out.println(prostokat.obwod());
    }
}
