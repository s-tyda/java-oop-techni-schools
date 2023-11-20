package org.technischools.oop.Adam;

public class Adam <T extends Comparable<T>>{
    private T value;

    public Adam(T value){
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
