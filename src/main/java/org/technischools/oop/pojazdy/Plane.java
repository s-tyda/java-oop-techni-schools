package org.technischools.oop.pojazdy;

import java.util.Arrays;

public class Plane extends Vehicle {
    private float rozpietosc;
    private int[] lokacjaWiezowca;

    public Plane(String kolor, float pojemnoscBaku, float waga, float rozpietosc) {
        super(kolor, pojemnoscBaku, waga);
        this.rozpietosc = rozpietosc;
        this.lokacjaWiezowca = new int[]{1,0};
    }

//    @Override
    public void zrobWRR() {
        System.out.println("samolot leci w kierunku wiezowca o lokalizacji " + Arrays.toString(this.lokacjaWiezowca));
    }

    public void boom(){
        System.out.println("Boom!");
    }
}
