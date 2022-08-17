import Animals.*;
import Enums.Environment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = CreateZoo();
        System.out.println("\nDetails of an individual animal");
        System.out.println("--------------");
        displayDetailsOfIndividualAnimal(zoo.get(2));

        System.out.println("\nDetails of zoo");
        System.out.println("--------------");
        displayDetailsOfAnimals(zoo);

        System.out.println("\nFood");
        System.out.println("--------------");
        displayAllFoodRequired(zoo);

        Environment environment = Environment.Forest;
        ArrayList<Animal> animalsOfEnvironment = generateAnimalsOfEnvironment(environment);
        System.out.printf("\nDetails of animals in %s\n", environment);
        System.out.println("--------------");
        displayDetailsOfAnimals(animalsOfEnvironment);
    }

    private static ArrayList<Animal> CreateZoo() {
        return new ArrayList<>() {
            {
                add(new Wolf("Wolves are large carnivorous canines with long muzzles, short ears, long legs, and long bushy tails."));
                add(new Panda("Pandas are bears that live in south central China that eat 99% bamboo."));
                add(new Penguin("Penguins are aquatic, flightless birds, highly adapted for life in water."));
                add(new Cod("Cod are fish that often live in oceans."));
            }
        };
    }

    public static void displayDetailsOfIndividualAnimal(Animal animal) {
        System.out.println(animal);
    }

    public static void displayDetailsOfAnimals(ArrayList<Animal> zoo) {
        for (Animal animal : zoo) {
            System.out.println(animal);
        }
    }

    public static ArrayList<Animal> generateAnimalsOfEnvironment(Environment environment) {
        ArrayList<Animal> animals = new ArrayList<>();
        switch (environment) {
            case Arctic -> {
                animals.add(new Penguin("Penguins are aquatic, flightless birds, highly adapted for life in water."));
                animals.add(new Seal("Seals, formally known as pinnipeds are carnivorous, semi-aquatic marine mammals."));
            }
            case Deserts -> {
                animals.add(new Camel("Camels are a hooved animal often dwelling in arid climates such as deserts."));
            }
            case Jungle -> {
                animals.add(new Gorilla("Gorillas are herbivorous African apes"));
                animals.add(new Leopard("Leopards are large felines that live around trees which they like to climb."));
            }
            case Forest -> {
                animals.add(new Wolf("Wolves are large carnivorous canines with long muzzles, short ears, long legs, and long bushy tails."));
            }
            case Ocean -> {
                animals.add(new Cod("Cod are fish that often live in oceans."));
            }
        }

        return animals;
    }

    public static void displayAllFoodRequired(ArrayList<Animal> zoo) {
        for (Animal animal : zoo) {
            System.out.printf("%s - %s\n", animal.getName(), animal.getFoodType());
        }
    }
}