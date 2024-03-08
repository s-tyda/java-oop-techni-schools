package org.technischools.oop.spr2.SprawdzianZadanie2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bonds bond1 = new Bonds(400, 5);
        Bonds bond2 = new Bonds(100, 1);
        Stock stock1 = new Stock(1000, 10, 5);
        Stock stock2 = new Stock(2000, 2, 5);

        List<Securities> securities= new ArrayList<Securities>();
        securities.add(bond1);
        securities.add(bond2);
        securities.add(stock1);
        securities.add(stock2);

        SecuritiesPortfolio portfel = new SecuritiesPortfolio(securities);
        portfel.step();
        System.out.println(portfel.sumValues());
    }
}
