package org.technischools.oop.pojazdy2;

public class Samochod extends Pojazd {
    public int iloscDrzwi;

    public Samochod(String kolor, float moc, String marka, String model, int iloscDrzwi) {
        super(kolor, moc, marka, model);
        this.iloscDrzwi = iloscDrzwi;
    }

    @Override
    public void zrobWRR() {
        System.out.println("Samochod robi wrr!");
    }
}
