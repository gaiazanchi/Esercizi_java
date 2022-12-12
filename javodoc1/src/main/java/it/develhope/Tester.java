package it.develhope;

/**
 * This class is the tester class, contains the main method
 * @author Gaia Zanchi
 */
public class Tester {

    /**
     * This method is the main method
     * @param args Input given
     */
    public static void main(String[] args) {

        WordGames wordGame = new WordGames();

        System.out.println(wordGame.addHelloWord("word"));
        System.out.println(wordGame.getFullName("Gaia", "Zanchi"));

    }

}
