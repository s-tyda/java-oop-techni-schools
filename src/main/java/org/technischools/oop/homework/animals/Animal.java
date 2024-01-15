package org.technischools.oop.homework.animals;

public abstract class Animal {
    private int age;
    private boolean isMale;

    public abstract boolean grow();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        this.isMale = male;
    }
}
