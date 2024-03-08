package org.technischools.oop.spr2.zad2;

public abstract class ValuePaper {
    private float value;
    private int id;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ValuePaper(float value, int id) {
        this.value = value;
        this.id = id;
    }

    public abstract void step();
}
