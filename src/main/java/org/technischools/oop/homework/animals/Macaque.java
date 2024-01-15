package org.technischools.oop.homework.animals;

public class Macaque extends Animal{
    @Override
    public boolean grow() {
        this.setAge(this.getAge() + 1);
        if (this.getAge() >= 27){
            return false;
        }
        return true;
    }
}
