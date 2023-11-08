package org.technischools.oop.generics;

public class ListaLiczb<T extends Number> {
    private T[] list;

    public ListaLiczb(T[] list) {
        this.list = list;
    }

    public void SetValue(int index, T value){
        list[index] = value;
    }

    public float AvgElements(){
        float sum = 0;
        for (T element:list) {
            sum += element.floatValue();
        }
        return sum/list.length;
    }
}
