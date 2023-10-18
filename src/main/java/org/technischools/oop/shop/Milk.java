package org.technischools.oop.shop;

public class Milk extends Product {

    public Milk(String productName, float priceNet, int countProducts) {
        super(productName, priceNet, countProducts);
        this.taxRate = 0.08f;
        this.markupProduct = 0.4f;
        this.priceNet = priceNet + priceNet*markupProduct;
        this.priceGross = this.priceNet + this.priceNet * this.taxRate;
    }

    @Override
    public String order(int a) {
        if (this.countProducts < a){
            return Milk.class.getName() + ": Mleczarnia";
        }
        else{
            return "";
        }
    }

}
