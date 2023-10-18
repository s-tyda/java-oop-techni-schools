package org.technischools.oop.maziaki;

public class Maziak {
    private String kolor;
    private double waga;

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public Maziak(String kolor, double waga) {
        this.kolor = kolor;
        this.waga = waga;
    }

    public Maziak(String kolor) {
        this.kolor = kolor;
        this.waga = 0;
    }

    @Override
    public String toString() {
        return "Maziak{" +
                "kolor='" + kolor + '\'' +
                ", waga=" + waga +
                '}';
    }

    private int funkcja(){
        return 1;
    }

    private int funkcja2(){
        return 2;
    }

    public void pisz(){
        int x = funkcja();
        int y = funkcja2();
        System.out.println("Piszę kolorem " + this.kolor);
    }

    public static void pisz(Maziak maziak){
        System.out.println("Piszę kolorem " + maziak.kolor);
    }
}

