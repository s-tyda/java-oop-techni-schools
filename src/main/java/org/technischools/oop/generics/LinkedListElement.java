package org.technischools.oop.generics;

public class LinkedListElement<E> {
    public E value;
    public LinkedListElement<E> next;
    public LinkedListElement<E> previous;

    public LinkedListElement(E value) {
        this.value = value;
        next = null;
        previous = null;
    }
}
