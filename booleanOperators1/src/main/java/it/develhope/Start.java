package it.develhope;

public class Start {

    public static void main(String[] args) {

        //2<=2 vale true, !true vale false, true &&false vale false
        System.out.println(2<=2 && !true); //result: false

        // !false vale true, 3>2 vale true, true && true vale true
        System.out.println(!false && 3>2); //result: true

        boolean t = false;
        boolean f = true;
        //!t vale true, f vale true, true || true vale true e !true vale false
        System.out.println(!(!t || f)); // result: false

        //6>6 vale false, true && true vale true, !true vale false, false ^ false vale false
        System.out.println(6>6 ^ !(true && true)); // result: false

    }

}
