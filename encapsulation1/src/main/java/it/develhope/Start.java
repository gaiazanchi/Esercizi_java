package it.develhope;

import java.util.Arrays;

public class Start {

    public static void main(String[] args) {

        House house = new House();

        //assegno a house floorsNumber, address
        house.setFloorsNumber(3);
        house.setAddress("Via Roma, 45");
        //creo un array di stringhe per i residents
        String[] residents = new String[]{"Lucy", "Mario", "Giulia"};
        //assegno residents a residentsNames (array della classe house)
        house.setResidentsNames(residents);

        //stampo i dettagli di house con i getter
        System.out.println("This house has " + house.getFloorsNumber() + " floors.");
        System.out.println("This house is situated in " + house.getAddress() + ".");
        //%s viene sostituito con Arrays.toString(residents) che è un metodo degli array che trasforma un array in stringa e in input prende il nome dell'array
        System.out.format("The residents are %s.", Arrays.toString(residents));

    }

}
