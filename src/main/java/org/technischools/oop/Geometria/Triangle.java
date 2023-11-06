package org.technischools.oop.Geometria;

public class Triangle extends FiguraAbstrakcyjna {
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public float obwod() {
        return a + b + c;
    }
    @Override
    public float pole() {
        double p = 0.5 * obwod();
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
