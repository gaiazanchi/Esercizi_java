package com.develhope;

public class House {

    public String address;
    public int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("I'm creating a house! It's situated in " + address + " and has " + numberOfFloors + " floors");
    }

}
