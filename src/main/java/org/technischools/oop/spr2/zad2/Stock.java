package org.technischools.oop.spr2.zad2;

import java.util.Random;

public class Stock extends ValuePaper{
    public Stock(float value, int id) {
        super(value, id);
    }

    @Override
    public void step() {
        Random random = new Random();
        if (random.nextBoolean()){
            setValue(getValue() * 1.1f);
        }
        else {
            setValue(getValue() * 0.9f);
        }
    }
}
