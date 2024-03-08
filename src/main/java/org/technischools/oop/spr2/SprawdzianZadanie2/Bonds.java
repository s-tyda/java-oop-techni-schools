package org.technischools.oop.spr2.SprawdzianZadanie2;

import java.util.Random;

public class Bonds extends Securities{
    public Bonds(float wartosc, int id) {
        super(wartosc, id);
    }

    @Override
    public void step() {
        Random random = new Random();
        if (random.nextBoolean()){
            this.setWartosc(this.getWartosc() * ((100 + 10) / 100));
        }
        else{
            this.setWartosc(this.getWartosc() * ((100 - 10) / 100));
        }
    }
}
