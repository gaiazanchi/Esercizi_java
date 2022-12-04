package it.develhope.interfaces;

public class Student extends CollegePerson implements LearningPerson{

    public int academicYear;

    @Override
    public void studyAtHome() {
        System.out.println("I'm studying at home");
    }

    public Student(String name, String surname, int id, int year){
        this.name = name;
        this.surname = surname;
        this.collegeID = id;
        this.academicYear = year;
    }

}
