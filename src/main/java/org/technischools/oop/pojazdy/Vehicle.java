package org.technischools.oop.pojazdy;

public abstract class Vehicle {

    private String kolor;
    private float pojemnoscBaku;
    private float waga;

    public Vehicle(String kolor, float pojemnoscBaku, float waga) {
        this.kolor = kolor;
        this.pojemnoscBaku = pojemnoscBaku;
        this.waga = waga;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public static float przeliczPojemnoscNaML(float pojemnoscBaku){
        return pojemnoscBaku * 1000;
    }

    public float przeliczPojemnoscNaML(){
        return this.pojemnoscBaku * 1000;
    }

    public abstract void zrobWRR();

    @Override
    public String toString() {
        return "Pojazd{" +
                "kolor='" + kolor + '\'' +
                ", pojemnoscBaku=" + pojemnoscBaku +
                ", waga=" + waga +
                '}';
    }
}
