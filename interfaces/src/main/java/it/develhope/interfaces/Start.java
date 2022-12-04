package it.develhope.interfaces;

public class Start {

    public static void main(String[] args) {

        Professor professor = new Professor("Giacomo", "Gherardini",1356, "Geography");
        professor.goToCollege();
        professor.teachToOtherPeople();

        Student student = new Student("Gaia", "Zanchi", 10987, 2022);
        student.goToCollege();
        student.studyAtHome();

        Assistant assistant = new Assistant("Giulia", "Rottigni", 9879, true);
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }

}
