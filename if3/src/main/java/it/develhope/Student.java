package it.develhope;

import java.util.Random;

public class Student {

    String name;
    int age;

    public Student(String studentName, int studentAge){
        name = studentName;
        age = studentAge;
    }

    public void guessingAge(){

        Random random = new Random();
        int number = random.nextInt(35);

        System.out.println("I generated the random number " + number + " for student " + this.name);

        if(number > this.age){
            System.out.println("The age of the student is less than " + number);
        }else if(number == this.age){
            System.out.println("The age of the student is equal to " + number);
        }else{
            System.out.println("The age of the student is more than " + number);
        }

    }

}
