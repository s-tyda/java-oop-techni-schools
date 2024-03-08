package org.technischools.oop.spr2.zad2;

public class Wallet {
    private ValuePaper[] valuePapers;

    public Wallet(ValuePaper[] valuePapers) {
        this.valuePapers = valuePapers;
    }

    public void step(){
        for (ValuePaper paper:valuePapers) {
            paper.step();
        }
    }

    public float getValue(){
        float sum = 0;
        for (ValuePaper paper:valuePapers) {
            sum += paper.getValue();
        }
        return sum;
    }
}
