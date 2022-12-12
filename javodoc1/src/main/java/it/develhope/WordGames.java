package it.develhope;

/**
 * This class represents the word game
 * @author Gaia Zanchi
 */
public class WordGames {

    /**
     * This method add Hello to a word
     * @param word The String given in input
     * @return A String obtained by concatenating "Hello" and word
     */
    public String addHelloWord(String word){
        return "Hello" +" " + word;
    }

    /**
     * This method gets the full name of the person
     * @param name The name of the person
     * @param surname The surname of the person
     * @return A String obtained concatenating name and surname
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }

}
