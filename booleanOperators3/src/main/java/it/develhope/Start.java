package it.develhope;

public class Start {

    public static void main(String[] args) {

        // true&&true vale true, false^false vale false, !false vale true, true ||true vale true poi ci sono due negazioni quindi resta true
        System.out.println(!(!(!(false ^ false) || (true && true)))); // result: true

        int x = 3;
        int y = 2;
        //3*2<=6 vale true, !true vale false, 3-2=1!=1 vale false, false&&false vale false
        System.out.println(!((x * y) <= 6) && (x - y != 1)); // result: false

    }

}
