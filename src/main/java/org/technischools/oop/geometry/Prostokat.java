package org.technischools.oop.geometry;

public class Prostokat extends FiguraGeometryczna {
    public double b;

    public Prostokat(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double pole() {
        return this.a * this.b;
    }

    @Override
    public double obw() {
        return this.b * 2 + this.a * 2;
    }
}
