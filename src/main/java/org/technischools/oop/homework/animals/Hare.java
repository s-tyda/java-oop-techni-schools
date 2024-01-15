package org.technischools.oop.homework.animals;

public class Hare extends Animal{

    @Override
    public boolean grow() {
        this.setAge(this.getAge() + 1);
        if (this.getAge() >= 5){
            return false;
        }
        return true;
    }
}
