package org.technischools.oop.homewrok.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ecosystem {
    private List<Animal> animals;

    public Ecosystem(List<Animal> animals) {
        this.animals = animals;
    }

    public void add(Animal animal){
        animals.add(animal);
    }

    public void remove(Animal animal){
        animals.remove(animal);
    }

    public Animal get(int index){
        return animals.get(index);
    }

    public void report(){
        int maleHare = 0;
        int femaleHare = 0;
        int maleMaqaque = 0;
        int femaleMaqaque = 0;

        for (Animal animal: animals) {
            if (animal instanceof Hare){
                if (animal.isMale()){
                    maleHare++;
                }
            } else if (animal instanceof Maqaque) {

            }
        }

        System.out.println("Report");
        System.out.println("Hare M: " + maleHare + ", F: " + femaleHare);
        System.out.println("Maqaque M: " + maleMaqaque + ", F: " + femaleMaqaque);
    }

    public void step(){
        List<Animal> newAnimals = new ArrayList<>();

        for (Animal animal:animals) {
            if (animal.grow()){
                newAnimals.add(animal);
            }
        }

        int maleHare = 0;
        int femaleHare = 0;
        int maleMaqaque = 0;
        int femaleMaqaque = 0;

        for (Animal animal: newAnimals) {
            if (animal instanceof Hare){
                if (animal.isMale()){
                    maleHare++;
                }
            } else if (animal instanceof Maqaque) {

            }
        }

        int newHare = Math.min(maleHare, femaleHare) * 2;
        int newMaqaque = Math.min(maleMaqaque * 2, femaleMaqaque);

        Random random = new Random(); // tworzenie generatora

        for (int i = 0; i < newHare; i++) {
            boolean rd = random.nextBoolean(); // wygenerowanie boola
            Animal animal = new Hare(0, rd);
            newAnimals.add(animal);
        }

        for (int i = 0; i < newMaqaque; i++) {
            boolean rd = random.nextBoolean(); // wygenerowanie boola
            Animal animal = new Maqaque(0, rd);
            newAnimals.add(animal);
        }

        this.animals = newAnimals;
    }
}
