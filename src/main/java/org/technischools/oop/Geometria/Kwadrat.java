package org.technischools.oop.Geometria;

public class Kwadrat extends FiguraAbstrakcyjna {
    public Kwadrat(int a) {
        super(a);
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
