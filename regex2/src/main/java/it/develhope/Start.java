package it.develhope;

public class Start {

    public static void main(String[] args) {

        String str = "tup tuup tuuup tuuuup";

        String str1 = str.replaceAll("u{2,3}", "x");

        System.out.println(str1);

    }

}
/*
with a regular expression, change into X
all repetitions of the letter u, considering at least
2 repetitions but no more than 3 repeated letters
print the result
 */