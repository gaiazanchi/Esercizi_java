package it.develhope.polimorphism;

public class Animal {

    String animalName;

    public Animal(String name){
        animalName = name;
    }

    public String animalSound(){
        return "Roarr!";
    }

    public String animalSound(String intensity){
        if(intensity == "high"){
            return "Roarrrrrrrrr!";
        }else if(intensity == "low"){
            return "Roar";
        }else{
            return "Cannot reproduce it properly";
        }
    }

}
