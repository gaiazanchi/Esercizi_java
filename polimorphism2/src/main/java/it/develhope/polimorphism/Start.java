package it.develhope.polimorphism;

public class Start {

    public static void main(String[] args) {

        Animal animal = new Animal("Lucy");
        animal.animalSound();

        Lion lion = new Lion("Dan");
        lion.animalSound();

        Cow cow = new Cow("Mary");
        cow.animalSound();

    }

}
