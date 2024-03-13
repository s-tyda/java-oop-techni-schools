package org.technischools.datastructures.gr1;
import org.technischools.oop.shop.Product;

import java.util.Map;
import java.util.HashMap;

public class Magazine {
    private Map<String, Integer> magazine = new HashMap<>();

    public void add(String product, Integer count){
        magazine.put(product, count);
    }

    public String removeOne(String product){
        if (magazine.containsKey(product)){
            magazine.put(product, magazine.get(product) - 1);
            return "Product count changed";
        } else {
            return "Product not fount";
        }
    }

    public String removeAll(String product){
        if (magazine.containsKey(product)){
            magazine.remove(product);
            return "All instances of product removed";
        } else {
            return "Product not fount";
        }
    }

    public void clear(){
        magazine.clear();
    }

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        magazine.add("Mefedron", 10);
        magazine.add("Gacie dyrektora", 1);
        magazine.removeOne("Mefedron");
        magazine.removeAll("Gacie dyrektora");
    }
}
