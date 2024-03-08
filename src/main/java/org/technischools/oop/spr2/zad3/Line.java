package org.technischools.oop.spr2.zad3;

public class Line implements ReadDevice, WriteDevice{
    private String memory;
    private Modem target;

    public Line(Modem target) {
        this.target = target;
    }

    public Line() {
    }

    @Override
    public String read() {
        return memory;
    }

    @Override
    public void write(String message) {
        memory = message;
        target.call();
    }
}
