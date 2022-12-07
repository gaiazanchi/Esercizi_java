package it.develhope.encapsulation;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        //uso i setter incorporati in @Data per dare un valore alle instance variables di Person
        person.setName("Mario");
        person.setSurname("Rossi");
        person.setAge(32);
        person.setHeight(1.8046);

        //uso i getter per prendere e poi stampare i valori delle instance variables di Person
        System.out.println("This person is " + person.getName() + " " + person.getSurname() +".");
        System.out.println("He/She is " + person.getAge() + " years old.");

        //Ho cercato sul web come poter troncare un double alla seconda cifra decimale
        String heightGet = String.format("%.2f", person.getHeight());
        System.out.println("He/She is " + heightGet + " meter/s tall.");

    }

}
