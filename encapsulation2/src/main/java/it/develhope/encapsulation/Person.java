package it.develhope.encapsulation;

public class Person {

    private String name;
    private String surname;
    private int age;
    /**
     * The height of the person [m]
     */
    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
