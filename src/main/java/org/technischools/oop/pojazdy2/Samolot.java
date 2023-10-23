package org.technischools.oop.pojazdy2;

public class Samolot extends Pojazd{
    public int liczbaMiejsc;

    public Samolot(String kolor, float moc, String marka, String model, int liczbaMiejsc) {
        super(kolor, moc, marka, model);
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Override
    public void zrobWRR() {
        System.out.println("samolot robi fru fru");
    }


}
