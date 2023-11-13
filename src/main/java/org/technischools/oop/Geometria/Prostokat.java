package org.technischools.oop.Geometria;

public class Prostokat implements FiguraAbstrakcyjna {
    int a;
    int b;
    @Override
    public float pole() {
        return b * a;
    }

    @Override
    public float obwod() {
        return 2 * b + 2 * a;
    }

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
