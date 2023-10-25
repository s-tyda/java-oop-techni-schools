package org.technischools.oop.shop;

public abstract class Product implements Shop, Comparable<Product>{

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

    static float SumProducts(Product[] products){
        float sum = 0;
        for (Product product: products) {
            sum += product.value();
        }
        return sum;
    }

    @Override
    public int compareTo(Product o) {
        float value1 = value();
        float value2 = o.value();
        if (value1 > value2){
            return 1;
        }
        else if (value1 < value2){
            return -1;
        }
        return 0;
    }
}
