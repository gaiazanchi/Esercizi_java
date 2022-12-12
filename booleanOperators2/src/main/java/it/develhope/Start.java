package it.develhope;

public class Start {

    public static void main(String[] args) {

        //55!=55 vale false, false^true vale true, false && true vale false
        System.out.println((55 != 55) && (false ^ true)); // result: false

        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';
        // !a vale false, !b vale true, false||true vale true.
        //c == d vale false, sono due tipi di variabili diversi
        //true || false vale true
        System.out.println((!a || !b) || c == d ); // result: true

        //false && true vale false, false && !false vale false, false|| false vale false
        System.out.println(false && true || false && !false); // result: false

        //false&&true vale false, false||true vale true, false||true vale true
        System.out.println((false && true) || (false || true)); // result: true

    }

}
