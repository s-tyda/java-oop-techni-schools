package org.technischools.oop.geometry;

public abstract class FiguraGeometryczna {
    public double a;

    public FiguraGeometryczna(double a){
        this.a = a;
    }

    public abstract double pole();
    public abstract double obw();
}
