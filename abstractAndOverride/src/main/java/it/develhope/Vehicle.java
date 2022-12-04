package it.develhope;

public abstract class Vehicle {

    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("This vehicle is a " + this.type + " and it has " + numberOfWheels +" wheels.");
    }

    public abstract void doVehicleSound();

}
