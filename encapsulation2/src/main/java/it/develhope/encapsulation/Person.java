package it.develhope.encapsulation;

import lombok.Data;

@Data
public class Person {

    String name;
    String surname;
    int age;
    /**
     * The height of the person [m]
     */
    double height;

}
