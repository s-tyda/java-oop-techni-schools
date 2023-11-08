package org.technischools.oop.generics;

import org.technischools.oop.shop.Product;

import java.util.Arrays;

public class list<T extends Comparable> {
    private T[] elements;

    public list(T[] elements) {
        this.elements = elements;
    }

    public T Max(){
        Arrays.sort(this.elements);
        return this.elements[elements.length - 1];
    }

    public T Min(){
        Arrays.sort(this.elements);
        return this.elements[0];
    }

    public void sort(){
        Arrays.sort(elements);
    }
}
