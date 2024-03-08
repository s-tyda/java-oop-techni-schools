package org.technischools.oop.spr2.SprawdzianZadanie2;

public abstract class Securities {
    private float wartosc;
    private int id;

    public float getWartosc() {
        return wartosc;
    }

    public void setWartosc(float wartosc) {
        this.wartosc = wartosc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Securities(float wartosc, int id) {
        this.wartosc = wartosc;
        this.id = id;
    }

    public abstract void step();
}
