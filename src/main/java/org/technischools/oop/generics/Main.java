package org.technischools.oop.generics;

import org.technischools.oop.shop.Book;
import org.technischools.oop.shop.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{5, 4, 2, 8};
        ListaLiczb<Integer> listaLiczb = new ListaLiczb<>(numbers);

        System.out.println(listaLiczb.AvgElements());
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
//        lista.remove(0);

        Product product = new Book("Mein kampf", 420.00f, 69);
        List<Product> lista2 = new ArrayList<>();
        lista2.add(product);
//        lista2.remove(product);
//        System.out.println(lista2.get());
        System.out.println(lista2);

    }
}
