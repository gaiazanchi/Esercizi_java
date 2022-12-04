package it.develhope;

public class Car extends Vehicle{

    public int numberOfDoors;
    public double carPrice;

    @Override
    public void doVehicleSound() {
        System.out.println("The car sound: broom broom");
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("This car has " + this.numberOfDoors + " doors.");
    }

    public Car(int wheels, int doors, double price){
        this.type = "car";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

}
