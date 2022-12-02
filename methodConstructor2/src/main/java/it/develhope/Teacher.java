package it.develhope;

public class Teacher {

    String name;

    public Teacher(String name){
        this.name = name;
        System.out.println("I'm hiring " + name + ", the new teacher!");
    }

    public void assignGrade(Student alumn, int finalGrade){
        alumn.grade = finalGrade;
        System.out.println(alumn.name + ", you took " + alumn.grade);
    }

}
