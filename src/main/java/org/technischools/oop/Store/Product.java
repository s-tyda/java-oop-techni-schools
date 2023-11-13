package org.technischools.oop.Store;

public abstract class Product implements Store {

    protected String productName;
    protected Float netPrice;
    protected Float grossPrice;
    protected Float tax;
    protected Float markup;
    protected Integer quantity;

    public Product(String productName, Float netPrice, Integer quantity) {
        this.productName = productName;
        this.netPrice = netPrice;
        this.quantity = quantity;

    }

    public float value() {
        return grossPrice * quantity;
    }

    @Override
    public boolean sell(int amount) {
        if((this.quantity >= amount) && (this.quantity > 0)){
            quantity = this.quantity - amount;
            return true;
        }
        return false;
    }
}

