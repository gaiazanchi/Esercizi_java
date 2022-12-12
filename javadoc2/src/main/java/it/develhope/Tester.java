package it.develhope;

/**
 * This is the tester class, contains the main method
 * @author Gaia Zanchi
 */
public class Tester {

    /**
     * The main method
     * @param args The input given to the main
     */
    public static void main(String[] args) {

        ArithmeticOperators operator = new ArithmeticOperators();

        System.out.println(operator.div(4,6));
        System.out.println(operator.mul(4,6));
        System.out.println(operator.sum(4,6));
        System.out.println(operator.sub(4,6));


    }

}
