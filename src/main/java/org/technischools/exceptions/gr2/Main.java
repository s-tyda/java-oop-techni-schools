package org.technischools.exceptions.gr2;

import java.io.IOException;

public class Main {
    public static void test() throws IOException {
        throw new IOException("Ta funkcja jest bez sensu");
    }

    public static void testUnchecked() {
        throw new ProductNotFoundException("Piwko");
    }

    public static void test1() throws IOException{
        test();
    }

    public static void test2() throws IOException{
        test1();
    }

    public static void test3() throws IOException{
        test2();
    }

    public static void main(String[] args) {
        try {
            testUnchecked();
        }
        catch (ProductNotFoundException ex) {
            System.out.println("Fajnie jakby produkt " + ex.getProduct() + " był w sklepie");
        }
//        try {
//            test();
//        }
//        catch (NullPointerException | IllegalArgumentException ex){
//            System.out.println("1");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("2");
//        }
//        catch (Exception ex){
//            System.out.println("3");
//        }

    }
}
