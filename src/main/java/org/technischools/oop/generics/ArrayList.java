package org.technischools.oop.generics;

public class ArrayList<E> {
    private E[] elements;
    private int lastIndex;

    public ArrayList() {
        elements = (E[]) new Object[10];
        lastIndex = 0;
    }

    public void add(E e){
        if (lastIndex > elements.length - 1){
            E[] newElements = (E[]) new Object[elements.length + 1];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

        elements[lastIndex] = e;
        lastIndex++;
    }

    public E get(int index){
        return elements[index];
    }

    public int size(){
        return lastIndex;
    }
}
