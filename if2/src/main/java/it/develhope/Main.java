package it.develhope;
public class Main {

    public static void main(String[] args) {

        String mySurname = "Zanchi";

        //metodo più complicato perchè non trovavo il metodo contains

        //boolean out = false;

        //for(int i = 1; i < mySurname.length(); i++) {

            //if ( mySurname.charAt(i-1) == 'n' && mySurname.charAt(i) =='i') {
                //out = true;
            //}
        //}
        //System.out.println("My surname contains \"ni\"? " + out);

        String output = mySurname.contains("ni") ? "contains" : "doesn't contain";
        System.out.println("Your surname " + output + " the sequence of letters 'ni'");

    }

}
