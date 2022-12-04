package it.develhope;

public class Boat extends Vehicle{

    /**
     * The maximum knot speed of the boat [km/h]
     */
    public double maxKnotSpeed;
    /**
     * The weight of the boat [kg]
     */
    public int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("The boat sound: whoosh");
    }

    public Boat(double maxSpeed, int weight){
        this.type = "boat";
        this.boatKilosWeight = weight;
        this.maxKnotSpeed = maxSpeed;
        this.numberOfWheels = 0;
    }

    public String getBoatWeightAndSpeed(){
        return "This boat weights " + this.boatKilosWeight +" kg and its maximum knot speed is " + this.maxKnotSpeed + " km/h.";
    }

}
