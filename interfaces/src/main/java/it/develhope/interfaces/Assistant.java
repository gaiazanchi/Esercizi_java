package it.develhope.interfaces;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{

    public boolean isGoingToBeAPhD;

    @Override
    public void studyAtHome() {
        System.out.println("I'm studying at home");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching to my students");
    }

    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeID = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }

}
