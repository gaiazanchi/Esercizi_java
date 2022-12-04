package it.develhope.interfaces;

public class Professor extends CollegePerson implements TeachingPerson{

    public String teachingSubject;

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching to my students");
    }

    public Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeID = id;
        this.teachingSubject = subject;
    }

}
