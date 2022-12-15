package it.develhope;

public class Start {

    public static void main(String[] args) {

        String str = "are you able to climb, are you able to swim or are you able to fly?";

        String str1 = str.replaceAll("\sare","_XYZ");

        System.out.println(str1);

    }
/*
with a regular expression, change into _XYZ
every occurrence of are that has a space before
print the result
 */
}
