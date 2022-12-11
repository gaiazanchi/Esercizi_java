package it.develhope;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        //creo una casa
        House house = new House();

        //creo uno scanner per comunicare con l'utente
        Scanner scanner = new Scanner(System.in);

        //chiedo all'utente di inserire una stringa che salvo nella variabile address e poi tramite il setter la assegno alla instance variable address di House
        System.out.println("Please set the address of the house: ");
        String address = scanner.nextLine();
        house.setAddress(address);

        //chiedo all'utente di inserire un int che salvo nella variabile floors e poi tramite il setter la assegno a floorsNumber di House
        System.out.println("Please set the number of floors of the house [integer number]: ");
        int floors = scanner.nextInt();
        house.setFloorsNumber(floors);

        //chiedo all'utente di inserire dei nomi separati da virgole
        System.out.println("Please set the residents of the house inserting a list of names divided by a coma: ");
        //leggo la riga inserita con lo scanner
        String residents = scanner.nextLine();
        //divido la stringa a livello delle virgole rappresentate da "-" e salvo le varie stringhe in cui residents è stata divisa in un array
        String[] residentsArray = residents.split("-");
        //con il setter assegno l'array a residentNames
        house.setResidentsNames(residentsArray);

        //stampo i dettagli di house con i getter
        System.out.println("This house has " + house.getFloorsNumber() + " floors.");
        System.out.println("This house is situated in " + house.getAddress() + ".");
        //%s viene sostituito con Arrays.toString(residents) che è un metodo degli array che trasforma un array in stringa e in input prende il nome dell'array
        System.out.format("The residents are %s.", Arrays.toString(residentsArray));

    }

}
