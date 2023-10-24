package org.technischools.oop;

import org.technischools.oop.geometry.Point;
import org.technischools.oop.geometry.Shape;
import org.technischools.oop.geometry.Star;
import org.technischools.oop.maziaki.Maziak;
import org.technischools.oop.pojazdy.Vehicle;
import org.technischools.oop.pojazdy.Car;
import org.technischools.oop.pojazdy.Plane;
import org.technischools.oop.pojazdy2.Pojazd;
import org.technischools.oop.pojazdy2.Samochod;
import org.technischools.oop.pojazdy2.Samolot;
import org.technischools.oop.users.User;

public class Main {

//    Samochod <- Pojazd <- Object

    public static void main(String[] args) {
        Maziak maziak = new Maziak("Niebieski", 75.8);
        System.out.println(maziak.getKolor());
        Maziak maziak2 = new Maziak("Czerwony");
        System.out.println(maziak2);
        System.out.println(Math.sqrt(50));
        maziak2.pisz();

        //        Pojazd pojazd = new Pojazd("czerwony", 50, 2);
//        System.out.println(pojazd);
//        pojazd.zrobWRR();
        Car car = new Car("niebieski", 100, 3, 5);
//        System.out.println(samochod);
//        System.out.println(pojazd.przeliczPojemnoscNaML());
//        System.out.println(samochod.przeliczPojemnoscNaML());
//        pojazd.zrobWRR();
//        samochod.zrobWRR();
        Plane plane11 = new Plane("bialy", 600, 40, 9.11f);
//        samolot11.zrobWRR();

        Vehicle[] array = new Vehicle[2];

        Vehicle vehicle2 = new Plane("niebieski", 100, 3, 5);
//        pojazd2.zrobWRR();
        array[0] = plane11;
        array[1] = car;

        for (Vehicle vehicle : array) {
            vehicle.zrobWRR();
        }

        Maziak maziak3 = new Maziak("Niebieski", 50);
        System.out.println(maziak3.getKolor());
        System.out.println(maziak3.getWaga());

        Maziak maziak4 = maziak;
        maziak4.setKolor("Czarny");
//        maziak4.kolor = "Czarny";

//        System.out.println(maziak3.kolor);
//
//        Maziak maziak5 = new Maziak("Czerowny", 100);
//        System.out.println(maziak5.kolor);
//        System.out.println(maziak5.waga);


        Maziak maziak6 = new Maziak("Zielony");
        System.out.println(maziak6);
        maziak6.pisz();
        Maziak.pisz(maziak6);

        Samochod auto1 = new Samochod("Czarny", 300, "Toyota", "Yaris", 5);
        System.out.println(auto1.marka);
//        auto1.zrobWRR();

        Samolot samolot = new Samolot("Biały", 24587, "Tupolew", "BEZ", 400);
//        samolot.zrobWRR();

        Pojazd[] pojazdy = new Pojazd[2];
        pojazdy[0] = auto1;
        pojazdy[1] = samolot;

        for (Pojazd pojazd:pojazdy) {
            pojazd.zrobWRR();
        }

        User User = new User("User1","1234");
        System.out.println(User.authorize("User1","1234"));
//        Point point1 = new Point(2.0f, 3.0f);
//        point1.move(1f, 2f);
//        System.out.println(point1.getX());
//        System.out.println(point1.getY());
//
//        Point point2 = new Point(3f, 5f);
//        point1.move(point2);
//        System.out.println(point1.getX());
//        System.out.println(point1.getY());
//        System.out.println(point1.distance(point2));
//
//        Shape star = new Star();
    }
}
