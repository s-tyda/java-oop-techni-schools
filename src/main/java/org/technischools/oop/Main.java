package org.technischools.oop;

import org.technischools.oop.geometry.Shape;
import org.technischools.oop.geometry.Star;
import org.technischools.oop.maziaki.Maziak;
import org.technischools.oop.pojazdy.Pojazd;
import org.technischools.oop.pojazdy.Samochod;
import org.technischools.oop.pojazdy.Samolot;
import org.technischools.oop.pojazdy2.samochod;

public class Main {

//    Samochod <- Pojazd <- Object

    public static void main(String[] args) {
//        Pojazd pojazd = new Pojazd("czerwony", 50, 2);
//        System.out.println(pojazd);
//        pojazd.zrobWRR();
        Samochod samochod = new Samochod("niebieski", 100, 3, 5);
//        System.out.println(samochod);
//        System.out.println(pojazd.przeliczPojemnoscNaML());
//        System.out.println(samochod.przeliczPojemnoscNaML());
//        pojazd.zrobWRR();
//        samochod.zrobWRR();
        Samolot samolot11 = new Samolot("bialy", 600, 40, 9.11f);
//        samolot11.zrobWRR();

        Pojazd[] array = new Pojazd[2];

        Pojazd pojazd2 = new Samolot("niebieski", 100, 3, 5);
//        pojazd2.zrobWRR();
        array[0] = samolot11;
        array[1] = samochod;

        for (Pojazd pojazd: array) {
            pojazd.zrobWRR();
        }

        Maziak maziak = new Maziak("Niebieski", 50);
        System.out.println(maziak.getKolor());
        System.out.println(maziak.getWaga());

        Maziak maziak2 = maziak;
        maziak2.setKolor("Czarny");
//        maziak2.kolor = "Czarny";

//        System.out.println(maziak.kolor);
//
//        Maziak maziak3 = new Maziak("Czerowny", 100);
//        System.out.println(maziak3.kolor);
//        System.out.println(maziak3.waga);


        Maziak maziak4 = new Maziak("Zielony");
        System.out.println(maziak4);
        maziak4.pisz();
        Maziak.pisz(maziak4);

        samochod auto1 = new samochod(300, "bmw");
        System.out.println(auto1.marka);


        Point point1 = new Point(2.0f, 3.0f);
        point1.move(1f, 2f);
        System.out.println(point1.getX());
        System.out.println(point1.getY());

        Point point2 = new Point(3f, 5f);
        point1.move(point2);
        System.out.println(point1.getX());
        System.out.println(point1.getY());
        System.out.println(point1.distance(point2));

        Shape star = new Star();
    }
}
