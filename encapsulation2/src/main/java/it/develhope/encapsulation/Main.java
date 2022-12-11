package it.develhope.encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //creo una persona
        Person person = new Person();

        //creo uno scanner per comunicare con l'utente
        Scanner scanner = new Scanner(System.in);

        //messaggio di avviso per l'utente
        System.out.println("Insert the name of the person: ");
        //leggo la stringa con lo scanner e la assegno a name
        String name = scanner.nextLine();
        //assegno name alla instance variable di Person
        person.setName(name);

        System.out.println("Insert the surname of the person: ");
        String surname = scanner.nextLine();
        person.setSurname(surname);

        System.out.println("Insert the age of the person: ");
        int age = scanner.nextInt();
        person.setAge(age);

        System.out.println("Insert the height of the person: ");
        double height = scanner.nextDouble();
        person.setHeight(height);

        //uso i getter per prendere e poi stampare i valori delle instance variables di Person
        System.out.println("This person is " + person.getName() + " " + person.getSurname() +".");
        System.out.println("He/She is " + person.getAge() + " years old.");

        //Ho cercato sul web come poter troncare un double alla seconda cifra decimale
        String heightGet = String.format("%.2f", person.getHeight());
        System.out.println("He/She is " + heightGet + " meter/s tall.");

    }

}
