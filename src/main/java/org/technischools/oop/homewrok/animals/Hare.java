package org.technischools.oop.homewrok.animals;

public class Hare extends Animal{
    public Hare(int age, boolean isMale) {
        super(age, isMale);
    }

    @Override
    public boolean grow() {
        setAge(getAge() + 1);
        return getAge() <= 5;
    }
}
