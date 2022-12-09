package it.develhope;

public class Main {

    public static void main(String[] args) {

        String mySurname = "Zanchi";
        boolean out = false;

        for(int i = 0; i < mySurname.length(); i++) {
            if ((mySurname.toCharArray())[i] == "n") && ((mySurname.toCharArray())[i + 1] == "i")) {
                out = true;
            }
        }

        System.out.println(out);

    }

}
