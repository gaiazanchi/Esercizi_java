package it.develhope;

import java.util.Random;

public class Student {

    //instance variables
    String name;
    int age;

    //constructor method
    public Student(String studentName, int studentAge){
        name = studentName;
        age = studentAge;
    }

    //method for guessing the age of the person
    public void guessingAge(){

        //genero un numero casuale intero usando java.util.Random, ho cercato come fare
        Random random = new Random();
        int number = random.nextInt(35);

        //stampo il numero randomicamente generato
        System.out.println("I generated the random number " + number + " for student " + this.name);

        //stampo cose diverse a seconda se il numero generato sia >/</= all'età dello studente
        if(number > this.age){
            System.out.println("The age of the student is less than " + number);
        }else if(number == this.age){
            System.out.println("The age of the student is equal to " + number);
        }else{
            System.out.println("The age of the student is more than " + number);
        }

    }

}
