package org.technischools.oop.spr2.zad2;

public class Main {
    public static void main(String[] args) {
        ValuePaper[] valuePapers = new ValuePaper[]{
                new Stock(100, 1),
                new Obligation(150, 2, 1.15f)
        };

        Wallet wallet = new Wallet(valuePapers);
        wallet.step();
        System.out.println(wallet.getValue());
    }
}
