package org.technischools.oop.spr2.zad3;

public class Main {
    public static void main(String[] args) {
        Modem modem1 = new Modem();
        Modem modem2 = new Modem();
        modem1.connect(modem2);
        modem1.writeMessage("SIEMA");
    }
}
