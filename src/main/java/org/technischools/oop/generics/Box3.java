package org.technischools.oop.generics;

public class Box3 {
    Object value;

    public Box3(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
