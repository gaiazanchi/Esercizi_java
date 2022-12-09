package it.develhope;

public class Person {

    int age;

    public Person(){

        int max = 80;
        int min = 5;

        int random = (int) Math.floor(Math.random()*(max - min + 1) + min);
        System.out.println("I generated the random number " + random);

        this.age = random;

    }

    public String getLifeStage(){
        if(age <= 12)
            return "child";
        else if (age >= 13 && age <= 19)
            return "teen";
        else if (age >= 20 && age <= 59)
            return "adult";
        else
            return "senior adult";
    }

}
