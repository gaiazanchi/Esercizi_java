package it.develhope;

import lombok.Data;

@Data
public class House {

    int floorsNumber;
    String address;
    String[] residentsNames;

    public House(){
        System.out.println("This is a house.");
    }

}
