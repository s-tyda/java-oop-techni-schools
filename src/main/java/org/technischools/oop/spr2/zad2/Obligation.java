package org.technischools.oop.spr2.zad2;

public class Obligation extends ValuePaper{
    private float oprocentowanie;

    public Obligation(float value, int id, float oprocentowanie) {
        super(value, id);
        this.oprocentowanie = oprocentowanie;
    }

    @Override
    public void step() {
        setValue(getValue() * oprocentowanie);
    }
}
