package it.develhope;

public class Main {

    public static void main(String[] args) {

        //creo due nuovi employees
        Employee gaia = new Employee("Gaia", "Zanchi", "Via Roma, Ranica, BG");
        Employee angela = new Employee("Angela", "Zanchi", "Via Paradiso, Palazzolo, BG");

        //creo badge e stampo i dettagli con il relativo metodo
        Badge badge1 = new Badge(gaia);
        badge1.showBadgeDetails();

        Badge badge2 = new Badge(angela);
        badge2.showBadgeDetails();

    }

}
