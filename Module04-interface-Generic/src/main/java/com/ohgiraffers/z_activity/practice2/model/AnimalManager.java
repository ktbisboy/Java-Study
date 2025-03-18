package com.ohgiraffers.z_activity.practice2.model;

import com.ohgiraffers.z_activity.practice2.service.Describable;

import java.util.ArrayList;

public class AnimalManager<T extends Animal> {
    private ArrayList<T> animals;

    public AnimalManager() {
        animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public String manageAnimals() {
        String result = "";
        for (T animal : animals) {
            if (animal instanceof Mammal) {
                result += animal.getName() + " (" + animal.getSpecies()
                        + ", " + animal.getAge() + "세), 서식지: " + ((Mammal) animal).getHabitat()
                        + ", " + ((Describable) animal).getDescription() + ", ";

            }
            else {
                result += animal.getName() + " (" + animal.getSpecies()
                        + ", " + animal.getAge() + "세), " + ((Describable) animal).getDescription();
            }
        }

        return result;
    }
}
