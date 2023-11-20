package org.technischools.oop.Adam;

import java.util.Arrays;

public class List<T extends Comparable<T>> {
    private T[] values;

    public List(T[] values) {
        this.values = values;
    }

    public void sort(){
        Arrays.sort(values);
    }

    public T min(){
        sort();
        return values[0];
    }

    public T max(){
        sort();
        return values[values.length - 1];
    }

    @Override
    public String toString() {
        return "List{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
