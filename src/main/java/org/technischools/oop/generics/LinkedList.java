package org.technischools.oop.generics;

public class LinkedList<E> {
    private LinkedListElement<E> head;
    private LinkedListElement<E> tail;
    private int size = 0;

    private void add(E e){
        LinkedListElement<E> newElement = new LinkedListElement<>(e);
        if (tail == null){
            head = newElement;
        }
        else {
            tail.next = newElement;
            newElement.previous = tail;
        }
        tail = newElement;
        size++;
    }

    private E get(int index){
        LinkedListElement<E> element = head;
        for (int i = 0; i < index; i++) {
            element = element.next;
        }
        return element.value;
    }

    public int size(){
        return size;
    }

    public void remove(int index){
        LinkedListElement<E> element = head;
        for (int i = 0; i < index; i++) {
            element = element.next;
        }
        if (element.previous != null){
            element.previous.next = element.next;
        }
        if (element.next != null){
            element.next.previous = element.previous;
        }
        if (element == head){
            head = element.next;
        }
        if (element == tail) {
            tail = element.previous;
        }

        element.next = null;
        element.previous = null;
    }
}
