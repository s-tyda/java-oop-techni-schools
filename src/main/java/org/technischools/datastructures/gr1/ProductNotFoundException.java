package org.technischools.datastructures.gr1;

public class ProductNotFoundException extends RuntimeException{
    private String product;

    public ProductNotFoundException(String product) {
        super("Product=" + product + " not found");
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
