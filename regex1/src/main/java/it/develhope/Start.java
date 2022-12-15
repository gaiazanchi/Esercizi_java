package it.develhope;

public class Start {

    public static void main(String[] args) {

        String str = "I Like to code near the Lake with my friend Luke";

        String str1 = str.replaceAll("L[^u]ke", "BLA");

        System.out.println(str1);

    }

}
