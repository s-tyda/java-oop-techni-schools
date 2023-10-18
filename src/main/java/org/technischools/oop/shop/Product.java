package org.technischools.oop.shop;

public abstract class Product implements Shop {

    protected String productName;
    protected float priceNet;
    protected float priceGross;
    protected float taxRate;
    protected float markupProduct;
    protected int countProducts;

    public Product(String productName, float priceNet, int countProducts) {
        this.productName = productName;
        this.priceNet = priceNet;
        this.countProducts = countProducts;
    }
    @Override
    public String order(int a) {
        return null;
    }

    @Override
    public float value() {
        return this.priceGross * this.countProducts;
    }

    @Override
    public boolean sell(int a) {
        if (this.countProducts >= a){
            this.countProducts -= a;
            return true;
        }
        return false;
    }
}
