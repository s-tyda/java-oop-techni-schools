package org.technischools.oop.pojazdy2;

public class Pojazd {
    public String kolor;
    public float moc;
    public String marka;
    public String model;


    public Pojazd(String kolor, float moc, String marka, String model) {
        this.kolor = kolor;
        this.moc = moc;
        this.marka = marka;
        this.model = model;
    }

    public void zrobWRR(){
        System.out.println("Pojazd robi wrr!");
    }
}
