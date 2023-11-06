package org.technischools.oop.Geometria;

public abstract class FiguraAbstrakcyjna {
    int a;

    public FiguraAbstrakcyjna(int a) {
        this.a = a;
    }

    public abstract float pole();
    public abstract float obwod();
}
