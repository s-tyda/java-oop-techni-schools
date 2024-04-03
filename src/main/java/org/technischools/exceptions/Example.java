package org.technischools.exceptions;

public class Example {
    public static int example(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("WARTOŚĆ NIE MOŻE BYĆ MNIEJSZA OD 0!");
        }

        return x;
    }

    public static void checkedException() throws Exception {
        throw new Exception();
    }

    public static int example1(int x) {
        return example2(x);
    }

    public static int example2(int x) {
        return example3(x);
    }

    public static int example3(int x) {
        return example(x);
    }

    public static void main(String[] args){
//        System.out.println(example(5));
//        System.out.println(example1(-2));
        try {
            System.out.println(example(-3));
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            checkedException();
        }
        catch (Exception ex) {
            System.out.println("Wyjątek obsłużony");
        }

        try {
            System.out.println(example(-10));
        }
        catch (ArithmeticException ex){
            System.out.println("1");
        }
        catch (RuntimeException ex) {
            System.out.println("2");
        }
        catch (Exception ex) {
            System.out.println("3");
        }

        try {
            System.out.println(example(-30));
        }
        catch (IllegalArgumentException | ArithmeticException ex){
            System.out.println("Wiele wyjątków");
        }
    }
}
