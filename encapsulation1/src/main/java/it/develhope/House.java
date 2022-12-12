package it.develhope;

public class House {

    int floorsNumber;
    String address;
    String[] residentsNames;

    public House(){
        System.out.println("This is a house.");
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }
}
