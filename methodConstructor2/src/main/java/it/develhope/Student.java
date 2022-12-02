package it.develhope;

public class Student {

    public String name;
    public int grade;

    public Student(String studentName){
        this.name = studentName;
        System.out.println("I'm adding to the students " + studentName);
    }

    public void getStudentDetails(){
        System.out.println("This is our student " + name + ". His/her grade is " + grade);
    }

}
