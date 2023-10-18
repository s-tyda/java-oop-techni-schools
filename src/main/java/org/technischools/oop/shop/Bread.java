package org.technischools.oop.shop;

public class Bread extends Product {
    public Bread(String productName, float priceNet, int countProducts) {
        super(productName, priceNet, countProducts);
        this.taxRate = 0.05f;
        this.markupProduct = 0.1f;
        this.priceNet = priceNet + priceNet*markupProduct;
        this.priceGross = this.priceNet + this.priceNet * this.taxRate;
    }

    @Override
    public String order(int a) {
        if (this.countProducts < a){
            return Bread.class.getName() + ": Piekarnia";
        }
        else{
            return "";
        }
    }
}
