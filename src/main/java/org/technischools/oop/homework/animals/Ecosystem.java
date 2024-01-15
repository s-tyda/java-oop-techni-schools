package org.technischools.oop.homework.animals;


import java.util.ArrayList;
import java.util.List;

public class Ecosystem {
    private List<Animal> animals;

    public Ecosystem(List<Animal> animals) {
        this.animals = animals;
    }

    public void report(){
        int macaqueMales = 0;
        int macaqueFemales = 0;
        int hareMales = 0;
        int hareFemales = 0;


        for (Animal animal : animals) {
            if (animal instanceof Hare){
                if (animal.isMale()){
                    hareMales++;
                }
                else {

                }
            }
            else if (animal instanceof Macaque) {

            }
        }

    }

    public void step(){
        List<Animal> newAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.grow()){
                newAnimals.add(animal);
            }
        }

        int macaqueMales = 0;
        int macaqueFemales = 0;
        int hareMales = 0;
        int hareFemales = 0;

        for (Animal animal : animals) {
            if (animal instanceof Hare){
                if (animal.isMale()){
                    hareMales++;
                }
                else {

                }
            }
            else if (animal instanceof Macaque) {

            }
        }

        int newHare = Math.min(hareFemales, hareMales) * 2;
        int newMacaques = Math.min(macaqueMales * 2, macaqueFemales);


        animals = newAnimals;
    }
}
