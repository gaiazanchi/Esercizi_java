package it.develhope;

public class Start {

    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";
        char[] charArray ={'c', 'i', 'a', 'o'};

        string1.getChars(0,2, charArray,0);
        string2.getChars(string2.length()-2,string2.length(),charArray,2);

        System.out.println(charArray);

    }

}
