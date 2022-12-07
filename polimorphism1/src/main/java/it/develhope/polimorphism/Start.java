package it.develhope.polimorphism;

public class Start {

    public static void main(String[] args) {

        Animal animal = new Animal("Giacomo");
        System.out.println(animal.animalSound());
        System.out.println(animal.animalSound("high"));
        System.out.println(animal.animalSound("low"));
        System.out.println(animal.animalSound("shabxuhasbi"));

    }

}
