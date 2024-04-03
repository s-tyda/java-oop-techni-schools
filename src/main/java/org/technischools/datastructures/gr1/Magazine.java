package org.technischools.datastructures.gr1;
import org.technischools.oop.shop.Product;

import java.util.Map;
import java.util.HashMap;

public class Magazine {
    private Map<String, Integer> magazine = new HashMap<>();

    public void add(String product, Integer count){
        if (count == null || count < 0){
            throw new IllegalArgumentException("Illegal count");
        }
        magazine.put(product, count);
    }

    public void removeOne(String product){
        if (!magazine.containsKey(product)){
            throw new ProductNotFoundException(product);
        }
        magazine.put(product, magazine.get(product) - 1);
    }

    public void removeAll(String product){
        if (!magazine.containsKey(product)){
            throw new ProductNotFoundException(product);
        }
        magazine.remove(product);
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
//        magazine.add("test", -3);
        try{
        magazine.removeOne("test");
        }
        catch (ProductNotFoundException ex){
            System.out.println(ex.getProduct());
        }
    }
}
