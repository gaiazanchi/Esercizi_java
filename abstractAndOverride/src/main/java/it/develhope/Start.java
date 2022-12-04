package it.develhope;

public class Start {

    public static void main(String[] args) {

        Car car = new Car(4,2,12346.8);
        car.doVehicleSound();
        car.showVehicleDetails();

        Boat boat = new Boat(90.3,200);
        boat.doVehicleSound();
        boat.showVehicleDetails();
        String boatDetails = boat.getBoatWeightAndSpeed();
        System.out.println(boatDetails);

    }

}
