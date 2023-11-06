package org.technischools.oop.Geometria;

public class Prostokat extends FiguraAbstrakcyjna {
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
        super(a);
        this.b = b;
    }
}
