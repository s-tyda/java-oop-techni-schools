package org.technischools.oop.generics;

import java.util.Arrays;

public class list<T extends Comparable> {
    private T[] elements;

    public T Max(){
        Arrays.sort(this.elements);
        return this.elements[elements.length - 1];
    }

    public T Min(){
        Arrays.sort(this.elements);
        return this.elements[0];
    }
}
