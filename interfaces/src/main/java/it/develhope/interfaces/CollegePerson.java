package it.develhope.interfaces;

public class CollegePerson {

    public String name;
    public String surname;
    public int collegeID;

    public void goToCollege(){
        System.out.println("I go to the college. I'm " + name + " " + surname + ". My collegeID is " + collegeID);
    }

}
