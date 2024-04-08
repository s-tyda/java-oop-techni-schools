package org.technischools.exceptions.gr2;

public class ProductNotFoundException extends RuntimeException {
    private String product;

    public ProductNotFoundException(String product) {
        super("Produkt=" + product + " nie został znaleziony");
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
