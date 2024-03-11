package org.technischools.datastructures.gr2;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> products = new HashMap<>();

    public boolean addProduct(String productName, int availability){
        if (products.containsKey(productName)){
            return false;
        }
        else {
            products.put(productName, availability);
            return true;
        }
    }

    public boolean updateProduct(String productName, int availability){
        if (!products.containsKey(productName)){
            return false;
        }
        else {
            products.put(productName, availability);
            return true;
        }
    }

    public Integer getProductAvailability(String productName) {
        return products.get(productName);
    }

    public void printWarehouse(){
        for (String productName:products.keySet()) {
            System.out.println(productName + ": " + products.get(productName));
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse.addProduct("bułki", 50));
        System.out.println(warehouse.addProduct("bułki", 100));
        System.out.println(warehouse.updateProduct("bułki", 100));
        System.out.println(warehouse.updateProduct("chleb", 100));
        System.out.println(warehouse.getProductAvailability("bułki"));
        System.out.println("--------");
        warehouse.addProduct("płatki", 1);
        warehouse.printWarehouse();
    }
}
