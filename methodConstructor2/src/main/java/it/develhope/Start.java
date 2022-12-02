package it.develhope;

public class Start {

    public static void main(String[] args) {

        System.out.println("-------------------");

        Student student1 = new Student("Gaia");
        Student student2 = new Student("Luigi");

        System.out.println("-------------------");

        Teacher teacher1 = new Teacher("Federica");

        System.out.println("-------------------");

        teacher1.assignGrade(student1, 9);
        teacher1.assignGrade(student2, 6);

        System.out.println("-------------------");

        student1.getStudentDetails();
        student2.getStudentDetails();

        System.out.println("-------------------");

    }

}
