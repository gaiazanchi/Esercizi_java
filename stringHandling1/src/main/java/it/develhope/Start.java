package it.develhope;

public class Start {

    public static void main(String[] args) {

        //quello commentato è un modo più complicato di farlo, la mia difficoltà è trovare il modo più semplice per fare una task

        String string1 = "Hello";
        String string2 = "How are you?";
        //char[] charArray ={'c', 'i', 'a', 'o'};

        String s1 = string1.substring(0,2);
        String s2 = string2.substring(string2.length()-2, string2.length());

        char[] char1 = (s1 + s2).toCharArray();

        //string1.getChars(0,2, charArray,0);
        //string2.getChars(string2.length()-2, string2.length(), charArray,2);

        //System.out.println(charArray);

        System.out.println(char1);

    }

}
