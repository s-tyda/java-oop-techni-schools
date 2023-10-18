package org.technischools.oop.geometry;

public class Trojkat extends FiguraGeometryczna{
    public double b;
    public double c;

    public Trojkat(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double pole() {
        double p = obw()/2;
        return Math.sqrt(p * (p -a) * (p - b) * (p -c));
    }

    @Override
    public double obw() {
        return this.a + this.b + this.c;
    }
}
