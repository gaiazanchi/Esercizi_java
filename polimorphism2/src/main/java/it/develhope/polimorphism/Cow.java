package it.develhope.polimorphism;

public class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("Cow sound: Muuu!");
    }
}
