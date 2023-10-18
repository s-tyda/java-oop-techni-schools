package org.technischools.oop.pojazdy;

public class Samochod extends Pojazd {
    private int iloscDrzwi;

    public Samochod(String kolor, float pojemnoscBaku, float waga, int iloscDrzwi) {
        super(kolor, pojemnoscBaku, waga);
        this.iloscDrzwi = iloscDrzwi;
    }

    @Override
    public float przeliczPojemnoscNaML() {
        return super.przeliczPojemnoscNaML() * 10;
    }

    @Override
    public void zrobWRR() {
        System.out.println("Samochod o kolorze " + getKolor() + " robi wrrr!");
    }

    @Override
    public String toString() {
//        return "Samochod{" +
//                "kolor='" + this.getKolor() + '\'' +
//                ", pojemnoscBaku=" + this.getKolor() +
//                ", waga=" + waga +
//                '}';
        return super.toString() + ", Samochod{" +
                "iloscDrzwi=" + iloscDrzwi +
                '}';
    }
}
