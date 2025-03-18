package com.ohgiraffers.z_activity.practice2;

import com.ohgiraffers.z_activity.practice2.model.Animal;
import com.ohgiraffers.z_activity.practice2.model.AnimalManager;
import com.ohgiraffers.z_activity.practice2.model.Bird;
import com.ohgiraffers.z_activity.practice2.model.Dog;

public class Application {
    public static void main(String[] args) {
        AnimalManager<Animal> manager = new AnimalManager<>();
        manager.addAnimal(new Dog("바둑이", 3));
        manager.addAnimal(new Bird("참새", 1));

        String result = manager.manageAnimals();
        System.out.println(result);
    }
}
