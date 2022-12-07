package it.develhope;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class House {

    int floorsNumber;
    String address;
    String[] residentsNames;

    public House(){
        System.out.println("This is a house.");
    }

}
