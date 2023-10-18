package org.technischools.oop.geometry;

public class Kwadrat extends FiguraGeometryczna {
    public Kwadrat(double a) {
        super(a);
    }

    @Override
    public double pole() {
        return this.a * this.a;
    }

    @Override
    public double obw() {
        return 4 * this.a;
    }
}
