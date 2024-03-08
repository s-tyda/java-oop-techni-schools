package org.technischools.oop.Adam;

import org.technischools.oop.shop.Product;

public class Adam <T>{
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
