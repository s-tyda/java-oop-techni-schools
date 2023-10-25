package org.technischools.oop.shop;

import org.technischools.oop.generics.Box;

import javax.sound.sampled.Port;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] array = new Product[3];
        array[0] = new Book("Mein kampf", 420.00f, 69);
        array[1] = new Milk("Mleko taty", 4.99f, 100);
        array[2] = new Bread("hlep żydni", 19.39f, 1945);

        Arrays.sort(array);

        System.out.println(array[0].order(30));
        System.out.println(Product.SumProducts(array));
        System.out.println(array[2].sell(6000000));

        Box<Product> bookBox = new Box<>(array[0]);

    }
}
