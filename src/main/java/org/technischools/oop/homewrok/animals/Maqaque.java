package org.technischools.oop.homewrok.animals;

public class Maqaque extends Animal{
    public Maqaque(int age, boolean isMale) {
        super(age, isMale);
    }

    @Override
    public boolean grow() {
        setAge(getAge() + 1);
        return getAge() <= 27;
    }
}
