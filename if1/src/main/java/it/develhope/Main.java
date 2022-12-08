package it.develhope;

public class Main {

    public static void main(String[] args) {

        String myName = "Gaia";

        //se il resto della divisione tra il numero di lettere del mio nome e 2 è zero vuol dire che il numero di lettere è pari
        if(myName.length()%2 == 0){
            System.out.println("The number of letters is even");
        }else{
            //altrimenti sarà dispari
            System.out.println("The number of letters is odd");
        }

    }

}
