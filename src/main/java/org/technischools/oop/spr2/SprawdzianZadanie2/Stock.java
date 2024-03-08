package org.technischools.oop.spr2.SprawdzianZadanie2;

public class Stock extends Securities {
    private final float interest;

    public Stock(float wartosc, int id, float interest) {
        super(wartosc, id);
        this.interest = interest;
    }

    @Override
    public void step() {
        this.setWartosc(this.getWartosc() * ((100 + this.interest) / 100));
    }
}
