package it.develhope;

public class Start {

    public static void main(String[] args) {

        String str = "x3z ? xYz ! R1 && __";

        //se ci metto uno spazio fra z e 0 mette anche gli spazi come *
        String str1 =str.replaceAll("[a-z0-9]","*");

        System.out.println(str1);

    }

}
/*
with a regular expression, change into *
every occurrence of a lowercase letter or of a digit
between 0 and 9
print the result
 */