package org.technischools.oop.Geometria;

public class Kwadrat implements FiguraAbstrakcyjna {
    int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    public float pole() {
        return a * a;
    }

    @Override
    public float obwod() {
        return 4 * a;
    }
}
