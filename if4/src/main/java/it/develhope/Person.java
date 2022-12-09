package it.develhope;

public class Person {

    //instance variable
    int age;

    //constructor method
    public Person(){

        int max = 80;
        int min = 5;

        // genero un numero casuale come chiesto e lo casto a intero, poi lo stampo
        int random = (int) Math.floor(Math.random()*(max - min + 1) + min);
        System.out.println("I generated the random number " + random);

        //assegno all'età della persona l'intero random che ho generato
        this.age = random;

    }

    //method
    public String getLifeStage(){
        //metto uno stage life diverso a seconda dell'età della persona, facendo attenzione a non lasciare esclusi dei valori
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
