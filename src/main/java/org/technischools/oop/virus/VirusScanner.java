package org.technischools.oop.virus;

public abstract class VirusScanner {
    public void scan(){
        prepareDataset();
        transformData();
        doScan();
    }

    public abstract void prepareDataset();
    public abstract void transformData();
    public abstract void doScan();
}
