package org.technischools.oop.shop;

public class Book extends Product{
    public Book(String productName, float priceNet, int countProducts) {
        super(productName, priceNet, countProducts);
        this.taxRate = 0.23f;
        this.markupProduct = 0.69f;
        this.priceNet = priceNet + priceNet*markupProduct;
        this.priceGross = this.priceNet + this.priceNet * this.taxRate;
    }

    public String order(int a) {
        if (this.countProducts < a){
            return Book.class.getName() + ": Empik";
        }
        else{
            return "";
        }
    }
}
