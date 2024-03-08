package org.technischools.oop.spr2.zad3;

public class Modem {
    private ReadDevice readLine;
    private WriteDevice writeLine;

    private void readMessage(){
        System.out.println(readLine.read());
    }

    public void connect(Modem modem){
        Line line = new Line(this);
        Line line2 = new Line(modem);
        this.readLine = line;
        modem.writeLine = line;
        this.writeLine = line2;
        modem.readLine = line2;
    }

    public void writeMessage(String message){
        writeLine.write(message);
    }

    public void call(){
        readMessage();
    }
}
