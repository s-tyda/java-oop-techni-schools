package org.technischools.oop.virus;

public abstract class VirusScanner {
    public void scan(){
        prepareDataset();
        transformData();
        doScan();
    }

    protected abstract void prepareDataset();
    protected abstract void transformData();
    protected abstract void doScan();
}
