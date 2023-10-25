package org.technischools.oop.generics;

import org.technischools.oop.shop.Product;

public class Box<T extends Product> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Box(T value) {
        this.value = value;
    }
}
