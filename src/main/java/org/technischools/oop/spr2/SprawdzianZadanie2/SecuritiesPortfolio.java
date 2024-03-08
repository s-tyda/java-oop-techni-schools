package org.technischools.oop.spr2.SprawdzianZadanie2;

import java.util.List;

public class SecuritiesPortfolio {
    private List<Securities> securities;

    public SecuritiesPortfolio(List<Securities> securities) {
        this.securities = securities;
    }

    public void step(){
        for (Securities s: this.securities) {
            s.step();
        }
    }

    public float sumValues(){
        float sum = 0;
        for (Securities s: this.securities) {
            sum += s.getWartosc();
        }
        return sum;
    }
}
