package it.develhope;

public class Start {

    public static void main(String[] args) {

        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring( 0, 6 );
        String sub2 = string1.substring( 7, string1.length() );

        String concatenatedString = sub1 + " " + string2 + " " + sub2;
        //String concatenatedString = sub1.concat(string2).concat(sub2); posso fare anche così ma non mi mette lo spazio

        char[] charArray = concatenatedString.toUpperCase().toCharArray();

        System.out.println(charArray);

    }

}
